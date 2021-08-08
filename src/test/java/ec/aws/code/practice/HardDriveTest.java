package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HardDriveTest {
	HardDrive solution = new HardDrive();

	@Test
	public void test1() {
		// solution [1, 2, 3], the function should return 4.
		String A = "my.song.mp3 11b\r\ngreatSong.flac 1000b\r\nnot3.txt 5b\r\nvideo.mp4 200b\r\ngame.exe 100b\r\nmov!e.mkv 10000b";
		String result = solution.solution(A);
		assertEquals("music 1011b\nimages 0b\nmovies 10200b\nother 105b", result);
	}
	
	
	@Test
	public void test2() {
		// solution [1, 2, 3], the function should return 4.
		String A = "my.song.mp3 11b\r\ngreatSong.flac 1000b\r\nnot3.txt 5b\r\nvideo.mp4 200b\r\ngame.exe 100b\r\nmov!e.mkv 10000b\r\nmov!e.mkv1 10000b";
		String result = solution.solution(A);
		assertEquals("music 1011b\nimages 0b\nmovies 10200b\nother 10105b", result);
	}
	
	@Test
	public void test3() {
		// solution [1, 2, 3], the function should return 4.
		String A = "my.song.mp3 11b\r\ngreatSong.flac 1000b\r\nnot3.txt 5b\r\nvideo.mp4 200b\r\ngame.exe 100b\r\nmov!e.mkv 10000b\r\nmov!e.mkv1 10000b\r\nmy.song.mp3 11b\r\nvideo.mp4 200b";
		String result = solution.solution(A);
		assertEquals("music 1022b\nimages 0b\nmovies 10400b\nother 10105b", result);
	}
	
	@Test
	public void test4() {
		// solution [1, 2, 3], the function should return 4.
		String A = "my.song.mp3 11b\r\ngreatSong.flac 1000b\r\nnot3.txt 5b\r\nvideo.mp4 200b\r\ngame.exe 100b\r\nmov!e.mkv 10000b\r\nmov!e.mkv1 10000b\r\nmy.song.mp3 11b\r\nvideo.mp4 200b\r\nimages.jpg 10b\r\nimages.bmp 15b";
		String result = solution.solution(A);
		assertEquals("music 1022b\nimages 25b\nmovies 10400b\nother 10105b", result);
	}

}
