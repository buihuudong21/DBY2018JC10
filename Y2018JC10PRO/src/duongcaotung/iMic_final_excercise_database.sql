USE [master]
GO
/****** Object:  Database [iMic_final_excercise]    Script Date: 09-Jun-18 11:59:56 PM ******/
CREATE DATABASE [iMic_final_excercise]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'iMic_final_excercise', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\iMic_final_excercise.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'iMic_final_excercise_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\iMic_final_excercise_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [iMic_final_excercise] SET COMPATIBILITY_LEVEL = 130
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [iMic_final_excercise].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [iMic_final_excercise] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET ARITHABORT OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [iMic_final_excercise] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [iMic_final_excercise] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET  DISABLE_BROKER 
GO
ALTER DATABASE [iMic_final_excercise] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [iMic_final_excercise] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET RECOVERY FULL 
GO
ALTER DATABASE [iMic_final_excercise] SET  MULTI_USER 
GO
ALTER DATABASE [iMic_final_excercise] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [iMic_final_excercise] SET DB_CHAINING OFF 
GO
ALTER DATABASE [iMic_final_excercise] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [iMic_final_excercise] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [iMic_final_excercise] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'iMic_final_excercise', N'ON'
GO
ALTER DATABASE [iMic_final_excercise] SET QUERY_STORE = OFF
GO
USE [iMic_final_excercise]
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [iMic_final_excercise]
GO
/****** Object:  Table [dbo].[Class]    Script Date: 09-Jun-18 11:59:56 PM ******/
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
/****** Object:  Table [dbo].[Student]    Script Date: 09-Jun-18 11:59:56 PM ******/
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
PRIMARY KEY CLUSTERED 
(
	[IdNumber] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Class] ([Name], [Major], [Khoa]) VALUES (N'JAVA092018', N'Dev', N'CNTT')
INSERT [dbo].[Class] ([Name], [Major], [Khoa]) VALUES (N'Y2017JC79 ', N'Khoa Học Máy Tính', N'Công Nghệ Thông Tin')
INSERT [dbo].[Class] ([Name], [Major], [Khoa]) VALUES (N'Y2018JV80 ', N'Trí Tuệ Nhân Tạo', N'Công Nghệ Thông Tin')
INSERT [dbo].[Class] ([Name], [Major], [Khoa]) VALUES (N'Y2040     ', N'Web', N'Nông Nghiệp')
INSERT [dbo].[Class] ([Name], [Major], [Khoa]) VALUES (N'Y304182   ', N'Java', N'CNTT')
INSERT [dbo].[Student] ([Name], [Address], [ClassName], [IdNumber], [PhoneNumber], [Gender]) VALUES (N'Tung', N'Bình Long', N'Y2017JC79 ', N'39429382  ', N'03094329  ', N'Nam       ')
INSERT [dbo].[Student] ([Name], [Address], [ClassName], [IdNumber], [PhoneNumber], [Gender]) VALUES (N'Phương', N'Phú Lạc', N'Y2017JC79 ', N'8242982   ', N'230948    ', N'Nam       ')
INSERT [dbo].[Student] ([Name], [Address], [ClassName], [IdNumber], [PhoneNumber], [Gender]) VALUES (N'Thành', N'Minh Tâm', N'Y2017JC79 ', N'93429884  ', N'42398429  ', N'Nữ        ')
ALTER TABLE [dbo].[Student]  WITH CHECK ADD  CONSTRAINT [FK_Student_Class] FOREIGN KEY([ClassName])
REFERENCES [dbo].[Class] ([Name])
GO
ALTER TABLE [dbo].[Student] CHECK CONSTRAINT [FK_Student_Class]
GO
USE [master]
GO
ALTER DATABASE [iMic_final_excercise] SET  READ_WRITE 
GO
