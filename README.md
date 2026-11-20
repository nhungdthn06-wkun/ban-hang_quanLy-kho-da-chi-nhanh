# DT02 - Bán hàng và kho đa chi nhánh

## Công nghệ
- Java 21, Spring Boot 4.1.2, Maven
- SQL Server 2022 (Docker)

## Cách chạy
1. Chạy SQL Server: `docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=<mật_khẩu>" -p 1433:1433 --name sqlserver -d mcr.microsoft.com/mssql/server:2022-latest`
2. Đặt biến: `$env:DB_PASSWORD = "<mật_khẩu>"`
3. Chạy ứng dụng: `cd app` rồi `.\mvnw.cmd spring-boot:run`

## Nguồn tham khảo
- (Ghi nguồn mã mẫu, thư viện, lược đồ ở đây)

## Khai báo công cụ AI
- (Ghi rõ công cụ và phạm vi sử dụng, nếu có)