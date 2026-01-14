package com.rkjavahub.stream.cheatsheet;

import java.util.List;

public record Employee(int id, String name, String department, List<Project> projects, double salary, String gender) {


}
