package ec.aws.code.practice.leetcode.interview;

public class FirstBadVersion {

	int firsBadVersion;

	public FirstBadVersion(int firsBadVersion) {
		super();
		this.firsBadVersion = firsBadVersion;
	}

	public int firstBadVersion(int n) {
		int badVersionMax = n;
		int badVersionMin = 1;		
		while (badVersionMin<badVersionMax) {
			int val = badVersionMin+retunMaxVal(badVersionMax, badVersionMin);
			if (isBadVersion(val)) {
				badVersionMax = val;
			} else {
				badVersionMin = val+1;
			}
		}
		return badVersionMax;
	}
	
	public int firstBadVersionOri(int n) {
	    int left = 1;
	    int right = n;
	    while (left < right) {
	        int mid = left + (right - left) / 2;
	        if (isBadVersion(mid)) {
	            right = mid;
	        } else {
	            left = mid + 1;
	        }
	    }
	    return left;
	}

	public int firstBadVersionO(int n) {
		for (int i = 1; i < n; i++) {
			if (isBadVersion(i)) {
				return i;
			}
		}
		return n;
	}

	private boolean isBadVersion(int badVersionMax) {
		return badVersionMax >= this.firsBadVersion;
	}

	public int retunMaxVal(int max, int min) {
		return (max - min) / 2;		
	}
}
