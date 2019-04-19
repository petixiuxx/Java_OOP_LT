package com.objectcomparing;

public class MyValue {
	int i;
//	public boolean equals(Object obj) {
//		return (this.i == ((MyValue) obj).i);
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyValue other = (MyValue) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
}

