package hello.hellospring.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends  JpaRepository<Posts, Long>{
}
