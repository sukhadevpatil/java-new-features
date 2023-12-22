package com.core.concepts.newfeatures.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GsonExample {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Staff staff = createStaff();

        String json = gson.toJson(staff);
        System.out.println(json);

//For single JSON objects
        try (FileWriter writer = new FileWriter(".\\staff.json")) {
            gson.toJson(staff, writer);
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        try (Reader reader = new FileReader(".\\staff.json")) {
            Staff staff1 = gson.fromJson(reader, Staff.class);
            System.out.println(staff1);

            JsonElement json3 = gson.fromJson(reader, JsonElement.class);
            String jsonInString = gson.toJson(json3);
            System.out.println(jsonInString);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
//==============For ArrayList of json objects
        try (FileWriter writer = new FileWriter(".\\staffArray.json")) {
            gson.toJson(Arrays.asList(staff, staff, staff), writer);
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        try (Reader reader = new FileReader(".\\staffArray.json")) {
            List<Staff> staff1 = gson.fromJson(reader, List.class);
            System.out.println(staff1);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    private static Staff createStaff() {
        Staff staff = new Staff();
        staff.setName("Sukhdev");
        staff.setAge(35);
        staff.setPosition(new String[] {"Associate", "Assistant Vice President", "Vice President"});
        Map<String, BigDecimal> salary = new HashMap<>() {{
            put("2007", new BigDecimal(300000));
            put("2009", new BigDecimal(500000));
            put("2012", new BigDecimal(700000));
            put("2017", new BigDecimal(1000000));
        }};
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("Java", "SQL", "Javascript", "HTML", "JSP/Servlet", "Spring"));

        return staff;
    }
}
