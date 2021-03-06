package com.john.exercisevue.repository;

import com.john.exercisevue.domain.Workout;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {

    Iterable<Workout> findByUserId(Long userId);

    Optional<Workout> findByWorkoutName(String workoutName);
}
