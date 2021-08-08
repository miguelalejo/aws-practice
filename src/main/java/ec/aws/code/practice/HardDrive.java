package ec.aws.code.practice;

import java.util.ArrayList;
import java.util.List;

public class HardDrive {
	public String solution(String S) {
		// write your code in Java SE 8
		String[] listFiles = S.split("\n");
		List<String> listNames = new ArrayList<>();
		List<Integer> listSize = new ArrayList<>();
		//Split only files with regex pattern
		for (int i = 0; i < listFiles.length; i++) {
			String[] splitRegister = listFiles[i].split(" ");
			String fileName = splitRegister[0];
			String temp = splitRegister[1].replace("b", "").replace("\r","");
			Integer size = Integer.valueOf(temp);
			if (isValidRegexName(fileName)) {
				listNames.add(splitRegister[0]);
				listSize.add(size);
			}
		}
		int sumMusicSize = 0;
		int sumImageSize = 0;
		int sumMovieSize = 0;
		int sumOther = 0;
		//Iterate from files
		for (int i = 0; i < listNames.size(); i++) {
			String fileName = listNames.get(i);
			if (isMusicFile(fileName)) {
				sumMusicSize += listSize.get(i);
			} else if (isImageFile(fileName)) {
				sumImageSize += listSize.get(i);
			} else if (isMovieFile(fileName)) {
				sumMovieSize += listSize.get(i);
			} else {
				sumOther += listSize.get(i);
			}

		}
		//This method can work in one forloop and we can change the method to factory pattern to separete each instance of a file.
		return String.format("music %sb\nimages %sb\nmovies %sb\nother %sb", sumMusicSize, sumImageSize, sumMovieSize,
				sumOther);

	}

	private boolean isMovieFile(String fileName) {
		return fileName.endsWith(".mp4") | fileName.endsWith(".avi") | fileName.endsWith(".mkv");
	}

	private boolean isImageFile(String fileName) {
		return fileName.endsWith(".jpg") | fileName.endsWith(".bmp") | fileName.endsWith(".gif");
	}

	private boolean isMusicFile(String fileName) {
		return fileName.endsWith(".mp3") | fileName.endsWith(".acc") | fileName.endsWith(".flac");
	}

	private boolean isValidRegexName(String fileName) {
		return fileName.matches("^([A-z]|[a-z]|[0-9]|[\\^&'@{}\\[\\],$=!-#()%.+~_])+\\.([a-z]|[0-9])*");
	}

}
