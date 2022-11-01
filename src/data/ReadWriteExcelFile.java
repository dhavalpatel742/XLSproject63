package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader d = new Xls_Reader("C:\\Testing\\NikulTest.xlsx");
		System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail = d.getCellData("Data1", 2, 2);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1", "Browser", 2);
		System.out.println(browser);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 12, "test12");
		System.out.println(d.getRowCount("Data1"));
		
		d.addColumn("Data1", "Nikul1");
		System.out.println(d.getColumnCount("Data1"));
	}

}
