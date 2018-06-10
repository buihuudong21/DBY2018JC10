

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Class](
	[Name] [nchar](10) NOT NULL,
	[Major] [nvarchar](50) NOT NULL,
	[Khoa] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Student]    Script Date: 28-May-18 10:21:29 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Student](
    
	[Name] [nvarchar](50) NOT NULL,
	[Address] [nvarchar](100) NOT NULL,
	[ClassName] [nchar](10) NOT NULL,
	[IdNumber] [nchar](10) NOT NULL,
	[PhoneNumber] [nchar](10) NULL,
	[Gender] [nchar](10) NOT NULL,
	[TrangThai] [nchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IdNumber] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Class] ([Name], [Major], [Khoa]) VALUES (N'Y2017JC79 ', N'Khoa Học Máy Tính', N'Công Nghệ Thông Tin')
GO
INSERT [dbo].[Class] ([Name], [Major], [Khoa]) VALUES (N'Y2018JV80 ', N'Trí Tuệ Nhân Tạo', N'Công Nghệ Thông Tin')
GO
INSERT [dbo].[Student]  VALUES (N'HOANG MINH NAM', N'Bình Phước', N'Y2017JC79 ', N'274857362 ', N'0394234234', N'Nam       ',N'Chưa Xóa')
GO
INSERT [dbo].[Student]  VALUES (N'NGUYEN VAN THANH', N'Chơn Thành', N'Y2017JC79 ', N'274859272 ', N'0384238742', N'Nam       ',N'Chưa Xóa')
GO
INSERT [dbo].[Student]  VALUES (N'LE VAN NAM', N'Bình Dương', N'Y2017JC79 ', N'284759375 ', N'0384447458', N'Nam       ',N'Chưa Xóa')
GO
INSERT [dbo].[Student]  VALUES (N'DUONG CAO TUNG', N'Bình Long', N'Y2017JC79 ', N'285431167 ', N'0167439087', N'Nam       ',N'Chưa Xóa')
GO
INSERT [dbo].[Student]  VALUES (N'NGUYEN THI THUY AN', N'Vĩnh Long', N'Y2017JC79 ', N'285431179 ', N'0987654321', N'Nữ        ',N'Chưa Xóa')
GO
INSERT [dbo].[Student]  VALUES (N'DOAN THI TRINH', N'Bình Phước', N'Y2017JC79 ', N'298345287 ', N'0193833743', N'Nữ       ',N'Chưa Xóa')
GO
INSERT [dbo].[Student]  VALUES (N'MINH NAM', N'Bình Phước', N'Y2017JC79 ', N'298121425 ', N'0193833743', N'Nữ       ',N'Chưa Xóa')
GO
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FK_Student_Class] FOREIGN KEY([ClassName])
REFERENCES [dbo].[Class] ([Name])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FK_Student_Class]
GO
USE [master]
GO

