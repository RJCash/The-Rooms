package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GroupRepository {
    @Autowired
    JdbcTemplate template;
    // list List<String> abr
    public List<String> abrre(String input){
        List<String> listTypes = new ArrayList<>();
        listTypes.add(input);
        return listTypes;
    }
    public List<Group> listGroups(String day){
        List<Group> groups = template.query("SELECT " +
                        " meeting.id, meeting.name, meeting.meetingtime, meeting.location," +
                        " meeting.id, meeting.name, meeting.meetingtime, meeting.address," +
                        " meeting.meetingday,meeting.city, meeting.latitude, meeting.longitude, type.abbreviation" +
                        " FROM meeting" +
                        //" UNION SELECT * From meeting_type UNION SELECT * FROM type" +
                        " JOIN meeting_type as mt ON mt.meetingid= meeting.id" +
                        " JOIN type ON mt.typeid = type.id" +
                        " WHERE meeting.meetingday = ? and city IS NOT NULL " +
                        " order by meetingtime LIMIT 50",
                new Object[]{day},
                (ResultSet, row) -> new Group(
                        ResultSet.getInt("id"),
                        ResultSet.getString("name"),
                        ResultSet.getString("address"),
                        ResultSet.getString("meetingtime"),
                        ResultSet.getString("meetingday"),
                        ResultSet.getString("city"),
                        abrre(ResultSet.getString("abbreviation")),
                        ResultSet.getDouble("latitude"),
                        ResultSet.getDouble("longitude")
                )
        );
        return groups;
    }
    public List<Group> quickFind(String day){
        List<Group> groups = template.query("SELECT" +
                        " meeting.id, meeting.name, meeting.meetingtime, meeting.location," +
                        " meeting.meetingday,meeting.city, meeting.latitude, meeting.longitude, type.abbreviation" +
                        " FROM meeting" +
                        " JOIN meeting_type as mt ON mt.meetingid= meeting.id" +
                        " JOIN type ON mt.typeid = type.id" +
                        " WHERE meetingday = ? and city IS NOT NULL" +
                        " order by meetingtime > CURRENT_TIME LIMIT 5",
                new Object[]{day},
                (ResultSet, row) -> new Group(
                        ResultSet.getInt("id"),
                        ResultSet.getString("name"),
                        ResultSet.getString("location"),
                        ResultSet.getString("meetingtime"),
                        ResultSet.getString("meetingday"),
                        ResultSet.getString("city"),
                        abrre(ResultSet.getString("abbreviation")),
                        ResultSet.getDouble("latitude"),
                        ResultSet.getDouble("longitude")
                )
        );
        return groups;
    }

    public Group specificGroup(Integer id) {
        return template.queryForObject("SELECT " +
                        " meeting.id, meeting.name, meeting.meetingtime, meeting.address," +
                        " meeting.meetingday,meeting.city, meeting.latitude, meeting.longitude, type.idname, type.abbreviation" +
                        " FROM meeting " +
                        " JOIN meeting_type as mt ON mt.meetingid= meeting.id" +
                        " JOIN type ON mt.typeid = type.id " +
                        " WHERE meeting.id = ? and city IS NOT NULL",
                new Object[]{id},
                (ResultSet, row) -> new Group(
                        ResultSet.getInt("id"),
                        ResultSet.getString("name"),
                        ResultSet.getString("address"),
                        ResultSet.getString("meetingtime"),
                        ResultSet.getString("meetingday"),
                        ResultSet.getString("city"),
                        abrre(ResultSet.getString("abbreviation")),
                        ResultSet.getDouble("latitude"),
                        ResultSet.getDouble("longitude")

                ));
    }
}
