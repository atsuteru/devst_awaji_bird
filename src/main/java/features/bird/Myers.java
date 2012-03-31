package features.bird;

public class Myers implements features.Myers {

	@Override
	public String getName(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		if (!isValidTriangle(arg0, arg1, arg2)) {
			throw new RuntimeException();
		}
		if ((arg0 == arg1) && (arg1 == arg2)) {
			return "���O�p�`";
		}
		if (arg0 == arg1) {
			return "�񓙕ӎO�p�`";
		}
		if (arg1 == arg2) {
			return "�񓙕ӎO�p�`";
		}
		if (arg0 == arg2) {
			return "�񓙕ӎO�p�`";
		}
		return "�s���ӎO�p�`";
	}

	private boolean isValidTriangle(int arg0, int arg1, int arg2) {
		if (arg0 <= 0) {
			return false;
		}
		if (arg1 <= 0) {
			return false;
		}
		if (arg2 <= 0) {
			return false;
		}
		
		if ((arg0 + arg1) <= arg2) {
			return false;
		}
		
		if ((arg1 + arg2) <= arg0) {
			return false;
		}
		
		if ((arg0 + arg2) <= arg1) {
			return false;
		}

		return true;
	}
}
