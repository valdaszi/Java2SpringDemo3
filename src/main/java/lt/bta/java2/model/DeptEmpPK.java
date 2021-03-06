package lt.bta.java2.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DeptEmpPK implements Serializable {
    private int empNo;
    private String deptNo;

    @Column(name = "emp_no", insertable = false, updatable = false)
    @Id
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Column(name = "dept_no", insertable = false, updatable = false)
    @Id
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeptEmpPK deptEmpPK = (DeptEmpPK) o;
        return empNo == deptEmpPK.empNo &&
                Objects.equals(deptNo, deptEmpPK.deptNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, deptNo);
    }
}
