export class Student {
    private studentId: number;
    private studentName: string;
    private studentDept: string;

    constructor(studentId: number, studentName: string, studentDept: string) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDept = studentDept;
    }

    displayAll() {
        console.log(`${this.studentId} ${this.studentName} ${this.studentDept}`);
    }

    hasCondition(studentDept: string):boolean {
        if (this.studentDept.toLowerCase === studentDept.toLowerCase)
        return true;
        else
        return false;
    }

}

let student = new Student(107, "Mohit", "Computer");
student.displayAll();
console.log(student.hasCondition("Computer"));