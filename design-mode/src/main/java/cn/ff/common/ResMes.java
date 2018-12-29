package cn.ff.common;

public class ResMes {

	private int code;
	
	private String mes;
	
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResMes [code=" + code + ", mes=" + mes + ", data=" + data + "]";
	}
	
	
	
}
