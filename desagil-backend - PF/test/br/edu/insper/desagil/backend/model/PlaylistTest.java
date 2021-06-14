package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;
	private Map<String, Integer> ratings;
	

	@BeforeEach
	void setUp() {
		ratings= new HashMap<>();
		
		
	}

	@Test
	void testRoundDownToZero() {
		ratings.put("carlos", 1);
		ratings.put("carlos", 2);
		ratings.put("carlos", 3);
		ratings.put("carlos", 3);
		
		ratings.putRating();
	
		assertEquals(2, ratings.averageRating(), DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		assertEquals(true, false);
	}

	@Test
	void testRoundDownToHalf() {
		assertEquals(true, false);
	}

	@Test
	void testRoundUpToOne() {
		assertEquals(true, false);
	}
}
