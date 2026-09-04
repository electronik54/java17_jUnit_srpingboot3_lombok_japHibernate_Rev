package com.electronik54.revision_3.jpa_hibernate.ch143_jpa_one_to_one.solution;

import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Solution {
    @Entity @Table(name = "users")
    static class User {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private UserProfile profile;
        public User() {}
        public User(String username) { this.username = username; }
        public Long getId() { return id; }
        public String getUsername() { return username; }
        public UserProfile getProfile() { return profile; }
        public void setProfile(UserProfile p) { this.profile = p; p.setUser(this); }
    }

    @Entity @Table(name = "user_profiles")
    static class UserProfile {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String displayName;
        private String email;
        private String bio;
        @OneToOne @JoinColumn(name = "user_id", unique = true)
        private User user;
        public UserProfile() {}
        public UserProfile(String displayName, String email, String bio) {
            this.displayName = displayName; this.email = email; this.bio = bio;
        }
        public Long getId() { return id; }
        public String getDisplayName() { return displayName; }
        public String getEmail() { return email; }
        public String getBio() { return bio; }
        public User getUser() { return user; }
        public void setUser(User user) { this.user = user; }
    }

    @Repository
    interface UserRepo extends JpaRepository<User, Long> {}

    @Service
    static class UserService {
        @Autowired private UserRepo repo;
        public void demo() {
            User user = new User("john_doe");
            user.setProfile(new UserProfile("John Doe", "john@example.com", "Java developer"));
            repo.save(user);

            System.out.println("=== Solution 143: @OneToOne ===\n");
            User found = repo.findById(1L).orElseThrow();
            System.out.println("User: " + found.getUsername());
            System.out.println("Profile: " + found.getProfile().getDisplayName() + ", "
                + found.getProfile().getEmail() + ", Bio: " + found.getProfile().getBio());
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        ctx.getBean(UserService.class).demo();
        ctx.close();
    }
}