package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Track track;
	private Artist artist;
	
	
	@BeforeEach
	void setUp() {
		Artist artist = new Artist("Travis");
	}

	@Test
	void testZeroSeconds() {
		track = new Track(artist, "Astro", 0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		track = new Track(artist, "Astro", 5);
		assertEquals("0:05", track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		track = new Track(artist, "Astro", 25);
		assertEquals("0:25", track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		track = new Track(artist, "Astro", 60);
		assertEquals("1:00", track.getDurationString());;
	}

	@Test
	void testOneMinuteFiveSeconds() {
		track = new Track(artist, "Astro", 65);
		assertEquals("1:05", track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		track = new Track(artist, "Astro", 85);
		assertEquals("1:25", track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		track = new Track(artist, "Astro", 120);
		assertEquals("2:00", track.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		track = new Track(artist, "Astro", 125);
		assertEquals("2:05", track.getDurationString());;
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		track = new Track(artist, "Astro", 145);
		assertEquals("2:25", track.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		assertEquals(true, false);
	}

	@Test
	void testTwoCollaborators() {
		assertEquals(true, false);
	}
}
