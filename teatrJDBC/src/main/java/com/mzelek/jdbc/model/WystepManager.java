package main.java.com.mzelek.jdbc.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;






public class WystepManager {
	private static Connection connection;
	private String url = "jdbc:hsqldb:hsql://localhost/";
	private String createTableWystep = "CREATE TABLE Wystep(aktor_id int , przedstawienie_id int)";

	private static PreparedStatement DodajWystep;
	private static PreparedStatement UsunWystep;
	private static PreparedStatement UsunjedenrekordWystep;
	private static PreparedStatement PokazWystep;
	private static PreparedStatement DropTableWystep;
	private static PreparedStatement PokazAktoraPoPrzedstawieniu;
	private static PreparedStatement PokazWystepPoAktorze;
		
	

	
	private Statement statement;
	
	public WystepManager()
	{
		try{
			connection = DriverManager.getConnection(url);
			statement = connection.createStatement();
			
			ResultSet rs = connection.getMetaData().getTables(null, null, null, null);
			boolean tableExists = false;
			while(rs.next()){
				if("Wystep".equalsIgnoreCase(rs.getString("TABLE_NAME"))){
					tableExists = true;
					break;
					
				}
			}
			if(!tableExists)
				statement.executeUpdate(createTableWystep);
			
			DodajWystep = connection.prepareStatement("INSERT INTO Wystep (aktor_id, przedstawienie_id) VALUES (?, ?)");
			UsunWystep = connection.prepareStatement("DELETE FROM Wystep");
			UsunjedenrekordWystep =  connection.prepareStatement("DELETE FROM Wystep where aktor_id = ? and przedstawienie_id = ?");
			PokazWystep = connection.prepareStatement("SELECT aktor_id, przedstawienie_id FROM Wystep");
			DropTableWystep = connection
					.prepareStatement("DROP TABLE Wystep");
			PokazAktoraPoPrzedstawieniu = connection
					.prepareStatement("Select aktor_id, przedstawienie_id FROM Wystep where aktor_id = ?");
			PokazWystepPoAktorze = connection
					.prepareStatement("Select aktor_id, przedstawienie_id FROM Wystep where aktor_id = ?");

		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return connection;
	}
	
	public static void wyczyscTabeleWystep(){
		try{
			UsunWystep.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static int dodajWystep(Wystep w){
		int count = 0;
		try {
			DodajWystep.setInt(1, w.getAktor_id());
			DodajWystep.setInt(2, w.getPrzedstawienie_id());
			count = DodajWystep.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	
	public static int UsunjedenrekordWystep (Wystep w)
	{
		int count = 0;
		try {
			
			UsunjedenrekordWystep.setInt(1,w.getAktor_id());
			UsunjedenrekordWystep.setInt(2,w.getPrzedstawienie_id());
			
			count = UsunjedenrekordWystep.executeUpdate();
		} 
		catch (SQLException e){
			e.printStackTrace();
		}
		return count;
	}

		
		public static List<Wystep> pokazWystep(){
			List<Wystep> wystepy = new ArrayList<Wystep>();
			try{
				ResultSet rs = PokazWystep.executeQuery();
				
				while(rs.next()){
					Wystep w = new Wystep();
					w.setAktor_id(rs.getInt("aktor_id"));
					w.setPrzedstawienie_id(rs.getInt("przedstawienie_id"));
					wystepy.add(w);
				}
			} catch(SQLException e){
				e.printStackTrace();
			}
			return wystepy;
		}
		public void dropTableWystep() {
			try {
				DropTableWystep.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			
			}
		}
			
		public Wystep pokazAktoraPoPrzedstawieniu(Wystep wystep)
		{
		    try
		    {
		    	PokazAktoraPoPrzedstawieniu.setInt(1, wystep.getPrzedstawienie_id());
		        ResultSet rs = PokazAktoraPoPrzedstawieniu.executeQuery();

		        while (rs.next())
		        {
		            wystep = new Wystep(rs.getInt("aktor_id"),rs.getInt("przedstawienie_id"));
		         
		            return wystep;
		        }
		    }
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }

		    return null;
		}

		
		public  List<Wystep> pokazWystepPoAktorze(Wystep w) {
			 List<Wystep> wystepy = new ArrayList<Wystep>();

			try {

				PokazWystepPoAktorze.setInt(1, w.getAktor_id());

				ResultSet rs = PokazWystepPoAktorze.executeQuery();

				while (rs.next()) {
					Wystep w1 = new Wystep();
					w1.setPrzedstawienie_id(rs.getInt("przedstawienie_id"));
					w1.setAktor_id(rs.getInt("aktor_id"));
					wystepy.add(w1);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return wystepy;
		}


	}




