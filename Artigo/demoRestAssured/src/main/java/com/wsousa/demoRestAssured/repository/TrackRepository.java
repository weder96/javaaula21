package com.wsousa.demoRestAssured.repository;

import com.wsousa.demoRestAssured.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface TrackRepository extends JpaRepository<Track, Long> {


    @Query("SELECT t FROM Track t WHERE t.id = ?1")
    Track findByDyn(String questionTracksTrackId);
}
