package com.electronik54.revision_3.jpa_hibernate.ch146_jpa_many_to_one.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "posts")
    static class Post {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
        private List<Comment> comments = new ArrayList<>();
        public Post() {}
        public Post(String title) { this.title = title; }
        public Long getId() { return id; }
        public String getTitle() { return title; }
        public List<Comment> getComments() { return comments; }
        public void addComment(Comment c) { comments.add(c); c.setPost(this); }
    }

    @Entity @Table(name = "comments")
    static class Comment {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String text;
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "post_id", nullable = false)
        private Post post;
        public Comment() {}
        public Comment(String text) { this.text = text; }
        public Long getId() { return id; }
        public String getText() { return text; }
        public Post getPost() { return post; }
        public void setPost(Post post) { this.post = post; }
    }

    @Repository
    interface PostRepo extends JpaRepository<Post, Long> {}

    @Service
    static class BlogService {
        @Autowired private PostRepo repo;
        public void demo() {
            Post post = new Post("Java 17 Features");
            post.addComment(new Comment("Great article!"));
            post.addComment(new Comment("Thanks for sharing"));
            post.addComment(new Comment("Very helpful"));
            repo.save(post);

            System.out.println("=== Solution 146: @ManyToOne ===\n");
            Post found = repo.findById(1L).orElseThrow();
            System.out.println("Post: \"" + found.getTitle() + "\"");
            found.getComments().forEach(c -> System.out.println("  Comment: \"" + c.getText() + "\""));
            System.out.println("Comments count: " + found.getComments().size());
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(BlogService.class).demo();
        ctx.close();
    }
}