INSERT INTO patients
(name, gender, age, address, phone, email, disease, room, blood_group)
VALUES
('Aarav Sharma', 'MALE', 34, 'Delhi', 9876543210, 'aarav.sharma@example.com', 'Fever', 'A101', 'A_Positive'),

('Diya Patel', 'FEMALE', 28, 'Ahmedabad', 9876543211, 'diya.patel@example.com', 'Migraine', 'B102', 'B_Positive'),

('Kabir Singh', 'MALE', 45, 'Lucknow', 9876543212, 'kabir.singh@example.com', 'Diabetes', 'C103', 'O_Negative'),

('Neha Iyer', 'FEMALE', 31, 'Chennai', 9876543213, 'neha.iyer@example.com', 'Asthma', 'A104', 'AB_Positive'),

('Rohan Verma', 'MALE', 39, 'Kanpur', 9876543214, 'rohan.verma@example.com', 'Hypertension', 'D105', 'A_Negative'),

('Ananya Gupta', 'FEMALE', 26, 'Noida', 9876543215, 'ananya.gupta@example.com', 'Food Poisoning', 'B106', 'O_Positive'),

('Vikram Joshi', 'MALE', 52, 'Jaipur', 9876543216, 'vikram.joshi@example.com', 'Arthritis', 'C107', 'B_Negative'),

('Priya Nair', 'FEMALE', 29, 'Kochi', 9876543217, 'priya.nair@example.com', 'Allergy', 'A108', 'AB_Negative'),

('Arjun Mehta', 'MALE', 36, 'Mumbai', 9876543218, 'arjun.mehta@example.com', 'Dengue', 'D109', 'O_Positive'),

('Sneha Reddy', 'FEMALE', 42, 'Hyderabad', 9876543219, 'sneha.reddy@example.com', 'Thyroid', 'B110', 'A_Positive'),

('Rahul Kapoor', 'MALE', 33, 'Pune', 9876543220, 'rahul.kapoor@example.com', 'Flu', 'A111', 'B_Positive'),

('Meera Menon', 'FEMALE', 27, 'Bengaluru', 9876543221, 'meera.menon@example.com', 'Anemia', 'C112', 'O_Negative'),

('Karan Malhotra', 'MALE', 48, 'Gurgaon', 9876543222, 'karan.malhotra@example.com', 'Heart Disease', 'D113', 'AB_Positive'),

('Ishita Jain', 'FEMALE', 24, 'Indore', 9876543223, 'ishita.jain@example.com', 'Typhoid', 'B114', 'A_Negative'),

('Aditya Saxena', 'MALE', 37, 'Agra', 9876543224, 'aditya.saxena@example.com', 'Malaria', 'A115', 'O_Positive'),

('Pooja Sharma', 'FEMALE', 30, 'Bhopal', 9876543225, 'pooja.sharma@example.com', 'Skin Allergy', 'C116', 'AB_Negative'),

('Nikhil Arora', 'MALE', 41, 'Chandigarh', 9876543226, 'nikhil.arora@example.com', 'Kidney Stone', 'D117', 'B_Negative'),

('Ritika Das', 'FEMALE', 35, 'Kolkata', 9876543227, 'ritika.das@example.com', 'Pneumonia', 'A118', 'A_Positive'),

('Yash Thakur', 'MALE', 22, 'Dehradun', 9876543228, 'yash.thakur@example.com', 'Fracture', 'B119', 'O_Negative'),

('Simran Kaur', 'FEMALE', 38, 'Amritsar', 9876543229, 'simran.kaur@example.com', 'Back Pain', 'C120', 'AB_Positive');

INSERT INTO doctor (name, specialization, phone, email)
VALUES
('Dr. Rakesh Mehta', 'Cardiology', 9876543210, 'rakesh.mehta@example.com'),
('Dr. Sneha Kapoor', 'Dermatology', 9876543211, 'sneha.kapoor@example.com'),
('Dr. Arjun Nair', 'Orthopedics', 9876543212, 'arjun.nair@example.com'),
('Dr. Priya Sharma', 'Neurology', 9876543213, 'priya.sharma@example.com'),
('Dr. Vikram Singh', 'Pediatrics', 9876543214, 'vikram.singh@example.com'),
('Dr. Anjali Verma', 'Gynecology', 9876543215, 'anjali.verma@example.com'),
('Dr. Rohit Gupta', 'General Medicine', 9876543216, 'rohit.gupta@example.com'),
('Dr. Neha Joshi', 'ENT', 9876543217, 'neha.joshi@example.com');

INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
('2025-07-01 10:30:00', 'General Checkup', 1, 2),
('2025-07-02 11:00:00', 'Skin Rash', 2, 2),
('2025-07-03 09:45:00', 'Knee Pain', 3, 3),
('2025-07-04 14:00:00', 'Follow-up Visit', 1, 1),
('2025-07-05 16:15:00', 'Consultation', 4, 4),
('2025-07-06 08:30:00', 'Allergy Treatment', 2, 5),
('2025-07-07 12:00:00', 'Migraine Checkup', 5, 6),
('2025-07-08 15:45:00', 'Eye Irritation', 6, 7),
('2025-07-09 10:15:00', 'Blood Pressure Review', 7, 8),
('2025-07-10 13:30:00', 'ENT Consultation', 8, 9);

INSERT INTO department (name, head_doctor_id)
VALUES
('Cardiology', 1),
('Dermatology', 2),
('Orthopedics', 3),
('Neurology', 4),
('Pediatrics', 5),
('Gynecology', 6),
('General Medicine', 7),
('ENT', 8);

INSERT INTO my_dpt_doctors (dpt_id, doctor_id)
VALUES
(1,1),
(1,7),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(3,1),
(4,7),
(5,2);


INSERT INTO insurance
(policy_number, provider, insurance_name, valid_until, created_at)
VALUES
('POL1001', 'Star Health', 'Comprehensive Health Plan', '2027-12-31', CURRENT_TIMESTAMP),
('POL1002', 'ICICI Lombard', 'Family Floater', '2028-05-15', CURRENT_TIMESTAMP),
('POL1003', 'HDFC ERGO', 'Critical Care Shield', '2027-08-20', CURRENT_TIMESTAMP),
('POL104', 'Future Generali', 'Smart Health Protect', '2028-09-15', CURRENT_TIMESTAMP),
('POL105', 'SBI General', 'Arogya Supreme', '2027-06-30', CURRENT_TIMESTAMP),
('POL106', 'Kotak General', 'Health Secure', '2028-11-20', CURRENT_TIMESTAMP),
('POL107', 'Liberty General', 'Health Connect', '2027-12-10', CURRENT_TIMESTAMP),
('POL108', 'ACKO', 'Platinum Health Plan', '2028-04-18', CURRENT_TIMESTAMP),
('POL109', 'Royal Sundaram', 'Lifeline Elite', '2027-08-25', CURRENT_TIMESTAMP),
('POL1010', 'National Insurance', 'Mediclaim Premium', '2028-02-28', CURRENT_TIMESTAMP);

UPDATE patients SET Patient_insurance_id = 1 WHERE id = 1;
UPDATE patients SET Patient_insurance_id = 2 WHERE id = 3;
UPDATE patients SET Patient_insurance_id = 3 WHERE id = 11;
UPDATE patients SET Patient_insurance_id = 4 WHERE id = 4;
UPDATE patients SET Patient_insurance_id = 5 WHERE id = 16;
UPDATE patients SET Patient_insurance_id = 6 WHERE id = 6;
UPDATE patients SET Patient_insurance_id = 7 WHERE id = 7;
UPDATE patients SET Patient_insurance_id = 8 WHERE id = 2;
UPDATE patients SET Patient_insurance_id = 9 WHERE id = 9;
UPDATE patients SET Patient_insurance_id = 10 WHERE id = 18;
