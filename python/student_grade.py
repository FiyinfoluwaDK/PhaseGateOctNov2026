def classroom_sheet(students, subjects):
    grade = []
    for student in range(students):
        for subject in range(subjects):
            subject_score = int(input(f"""
            Entering for Student {student + 1}
            Enter score for Subject {subject + 1}
            """))
            grade[student].append(subject)

def student_insert(grade, number_of_student):
    for count in range(1, number_of_student + 1):
        grade[count].insert(0, "Student "+ count)
        
    return grade

def total_score_append(grade):
    for count in range(len(grade)):
        grade[count].append(\t sum(grade[count]))
    
    return grade
    
total_students = int(input("How many students do you have?"))

total_subjects = int(input("How many subjects do they offer?"))

print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
print("Saved successfully")

student_grade = classroom_sheet(total_students, total_subjects)

