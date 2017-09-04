package lt.zvaliauskas.samplespringproject.service;

import lt.zvaliauskas.samplespringproject.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Query("SELECT q FROM Question q")
    List<Question> findAllQueries();
}
