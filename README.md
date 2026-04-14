# 🏥 Hospital Appointment System

The **Hospital Appointment Booking System** is a Spring Boot backend API that allows:  
- **Patients** to book and manage appointments  
- **Doctors** to manage schedules and approve/reject appointments  
- **Admins** to oversee hospital operations, manage patients & doctors 
- All data handling is secured with **JWT authentication**  


## 🔑 Authentication Endpoints

- **Register** → `POST /api/auth/register`  
- **Login** → `POST /api/auth/login`  

---

## 👤 User Endpoints

- **Get All Users** → `GET /api/user`  
- **Get Current User** → `GET /api/user/me`  
- **Activate User** → `PUT /api/user/{userId}/activate`  
- **Deactivate User** → `PUT /api/user/{userId}/deactivate`  
- **Block User** → `PUT /api/user/{userId}/block`  

---

## 🧑‍⚕️ Doctor Endpoints

- **Get Doctor by ID** → `GET /api/doctors/{id}`  
- **Update Doctor** → `PUT /api/doctors/{id}?currentUserId={id}&currentUserRole={role}`  
- **Delete Doctor** → `DELETE /api/doctors/{id}?currentUserId={id}&currentUserRole={role}`  
- **Get All Doctors (with optional filter by specialization)** → `GET /api/doctors?specialization={specialization}`  

---

## 🧑‍🤝‍🧑 Patient Endpoints

- **Get Patient by ID** → `GET /api/patients/{id}`  
- **Update Patient** → `PUT /api/patients/{id}`  

---

## 📅 Appointment Endpoints

- **Book Appointment** → `POST /api/appointments`  
- **Get All Appointments** → `GET /api/appointments`  
- **Get Appointment by ID** → `GET /api/appointments/{id}`  
- **Get Patient Appointments** → `GET /api/appointments/patient/{patientId}`  
- **Get Doctor Appointments** → `GET /api/appointments/doctor/{doctorId}`  
- **Approve Appointment** → `PUT /api/appointments/{id}/approve`  
- **Reject Appointment** → `PUT /api/appointments/{id}/reject`  
- **Cancel Appointment** → `PUT /api/appointments/{id}/cancel`  

---

## 🔒 Roles & Permissions

## Admin

Manage users (activate/block)

View all appointments

## Doctor

Manage profile & availability

Approve/Reject/Cancel appointments

## Patient

Book/Cancel appointments

View own appointments

---

## 📌 Notes

All responses are in JSON format.

Authentication uses JWT tokens returned from /api/auth/login or /api/auth/register.

---

## 🚀 Technologies Used

Spring Boot

Spring Security + JWT

MySQL

Render (Deployment)
