package dao;

import dto.HostelDTO;
import java.util.List;

public interface HostelDAO {

    void addStudent(HostelDTO student);

    HostelDTO getStudentById(int id);

    List<HostelDTO> getAllStudents();

    void updateStudent(HostelDTO student);

    void deleteStudent(int id);
}
