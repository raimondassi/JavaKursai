package lt.zvaliauskas.samplespringproject.service;

import lt.zvaliauskas.samplespringproject.domain.Question;
import lt.zvaliauskas.samplespringproject.domain.QuestionValue;
import org.springframework.data.jpa.repository.JpaRepository;

interface QuestionValuesRepository extends JpaRepository<QuestionValue, Integer> {
}
