package model;

import java.sql.ResultSet;
import java.sql.SQLException;

// generic 타입
@FunctionalInterface
public interface Mapper <T> {
	
	T maping(ResultSet rs) throws SQLException;
}
