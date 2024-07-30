"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(studentId, studentName, studentDept) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDept = studentDept;
    }
    Student.prototype.displayAll = function () {
        console.log("".concat(this.studentId, " ").concat(this.studentName, " ").concat(this.studentDept));
    };
    Student.prototype.hasCondition = function (studentDept) {
        if (this.studentDept.toLowerCase === studentDept.toLowerCase)
            return true;
        else
            return false;
    };
    return Student;
}());
exports.Student = Student;
var student = new Student(107, "Mohit", "Computer");
student.displayAll();
console.log(student.hasCondition("Computer"));
