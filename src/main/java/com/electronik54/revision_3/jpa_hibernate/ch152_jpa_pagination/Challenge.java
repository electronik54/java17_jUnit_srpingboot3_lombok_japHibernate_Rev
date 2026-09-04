package com.electronik54.revision_3.jpa_hibernate.ch152_jpa_pagination;

/**
 * Challenge 152: JPA Pagination & Sorting
 * 
 * Challenge Statement:
 * Implement pagination with Spring Data JPA's Pageable and Sort.
 * Demonstrate:
 * - PageRequest.of(page, size, Sort) for paginated queries
 * - Page<T> with total elements, total pages, and content
 * - Sort.by(Sort.Direction.DESC, "property") for sorting
 * - Slice<T> for lighter pagination (no total count query)
 * - Custom @Query with Pageable parameter
 * 
 * Hint:
 * - Pageable is 0-indexed (page 0 = first page)
 * - Page has getTotalPages(), getTotalElements(), getContent()
 * - Slice has getContent(), hasNext() but no total count
 * - Sort can be combined: Sort.by("lastName").and(Sort.by("firstName"))
 * - @Query("...") with Pageable parameter automatically adds count query
 * 
 * Expected Output (Solution):
 * Page 0/5 (size=2): [Alice, Bob] - Total employees: 10
 * Page 1/5 (size=2): [Charlie, Diana]
 * Page 2/5 (size=2): [Eve, Frank]
 * Sorted by salary DESC: [Charlie($120k), Bob($100k), Alice($95k)...]
 */
public class Challenge {

}