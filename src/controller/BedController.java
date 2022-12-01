package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Bed;

public class BedController {
    DbConnection dbConnection;

    public int insertdetails(Bed bed) {
        int ward_no = bed.getWardNo();
        String ward_type = bed.getWardType();
        String bed_type = bed.getBedType();
        String bed_size = bed.getBedSize();

        String insertQuery = "insert into bed(ward_no,ward_type,bed_type,bed_size)" +
                "values('" + ward_no + "','" + ward_type + "','" + bed_type + "','" + bed_size + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet viewDetails(Bed bed){
        String selectQuery = "select * from bed where status='"+"active"+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public ResultSet selectdetails(Bed bed){
        String selectQuery = "select * from bed";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int changestatus(Bed bed){
        int BedNo = bed.getBedNo();

        String UpdateQuery = "update bed set status='"+"active"+"' where bed_no='"+BedNo+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(UpdateQuery);
        return result;
    }

    public int updatestatus(Bed bed){
        String updateQuery = "update bed set status='"+"inactive"+"' where status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }
}
