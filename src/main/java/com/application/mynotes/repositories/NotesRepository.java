package com.application.mynotes.repositories;

import com.application.mynotes.models.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Long> {
	
	Notes findByTitle(final String title);
}
