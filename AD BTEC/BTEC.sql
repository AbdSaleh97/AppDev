USE [BTRS]
GO
/****** Object:  Table [dbo].[admin]    Script Date: 23/09/07 3:22:14 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[admin](
	[userName] [varchar](250) NOT NULL,
	[password] [varchar](250) NOT NULL,
	[adminID] [int] NOT NULL,
	[BusTripID] [int] NULL,
 CONSTRAINT [PK_admin] PRIMARY KEY CLUSTERED 
(
	[adminID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[booking]    Script Date: 23/09/07 3:22:14 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[booking](
	[tripID] [int] NOT NULL,
	[passengerID] [int] NOT NULL,
	[bookingID] [int] NOT NULL,
 CONSTRAINT [PK_booking] PRIMARY KEY CLUSTERED 
(
	[bookingID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[busTrip]    Script Date: 23/09/07 3:22:14 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[busTrip](
	[tripID] [int] NOT NULL,
	[tripDestination] [varchar](250) NOT NULL,
	[availability] [int] NOT NULL,
	[startDate] [date] NOT NULL,
	[endDate] [date] NOT NULL,
	[busNumber] [int] NOT NULL,
 CONSTRAINT [PK_busTrip] PRIMARY KEY CLUSTERED 
(
	[tripID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[passenger]    Script Date: 23/09/07 3:22:14 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[passenger](
	[passengerID] [int] NOT NULL,
	[userName] [varchar](250) NOT NULL,
	[emailAdd] [varchar](250) NOT NULL,
	[name] [varchar](250) NOT NULL,
	[language] [varchar](250) NULL,
	[password] [varchar](250) NOT NULL,
	[mobileNumber] [varchar](250) NOT NULL,
 CONSTRAINT [PK_passenger] PRIMARY KEY CLUSTERED 
(
	[passengerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[admin] ([userName], [password], [adminID], [BusTripID]) VALUES (N'admin', N'1234', 1, NULL)
GO
INSERT [dbo].[booking] ([tripID], [passengerID], [bookingID]) VALUES (9, 12, 1)
INSERT [dbo].[booking] ([tripID], [passengerID], [bookingID]) VALUES (11, 12, 2)
INSERT [dbo].[booking] ([tripID], [passengerID], [bookingID]) VALUES (12, 12, 3)
INSERT [dbo].[booking] ([tripID], [passengerID], [bookingID]) VALUES (11, 12, 4)
INSERT [dbo].[booking] ([tripID], [passengerID], [bookingID]) VALUES (9, 20, 5)
INSERT [dbo].[booking] ([tripID], [passengerID], [bookingID]) VALUES (43, 20, 6)
INSERT [dbo].[booking] ([tripID], [passengerID], [bookingID]) VALUES (9, 20, 7)
INSERT [dbo].[booking] ([tripID], [passengerID], [bookingID]) VALUES (9, 20, 8)
GO
INSERT [dbo].[busTrip] ([tripID], [tripDestination], [availability], [startDate], [endDate], [busNumber]) VALUES (9, N'ammaj', 0, CAST(N'2023-05-09' AS Date), CAST(N'2023-05-09' AS Date), 342)
INSERT [dbo].[busTrip] ([tripID], [tripDestination], [availability], [startDate], [endDate], [busNumber]) VALUES (11, N'irbid', 1, CAST(N'2023-08-30' AS Date), CAST(N'2023-08-30' AS Date), 355)
INSERT [dbo].[busTrip] ([tripID], [tripDestination], [availability], [startDate], [endDate], [busNumber]) VALUES (12, N'aqaba', 1, CAST(N'2023-09-01' AS Date), CAST(N'2023-09-02' AS Date), 455)
INSERT [dbo].[busTrip] ([tripID], [tripDestination], [availability], [startDate], [endDate], [busNumber]) VALUES (34, N'macca', 1, CAST(N'2023-09-06' AS Date), CAST(N'2023-09-08' AS Date), 678)
INSERT [dbo].[busTrip] ([tripID], [tripDestination], [availability], [startDate], [endDate], [busNumber]) VALUES (43, N'salt', 1, CAST(N'2023-09-02' AS Date), CAST(N'2023-09-02' AS Date), 543)
INSERT [dbo].[busTrip] ([tripID], [tripDestination], [availability], [startDate], [endDate], [busNumber]) VALUES (456, N'aien', 1, CAST(N'2023-09-03' AS Date), CAST(N'2023-09-03' AS Date), 34634)
GO
INSERT [dbo].[passenger] ([passengerID], [userName], [emailAdd], [name], [language], [password], [mobileNumber]) VALUES (0, N'tsdhhdt', N'dtsh', N'strd', N'd', N'tsr', N'34567')
INSERT [dbo].[passenger] ([passengerID], [userName], [emailAdd], [name], [language], [password], [mobileNumber]) VALUES (1, N'ratien', N'iteo', N'ntieon', N'toin', N'ot', N'53245')
INSERT [dbo].[passenger] ([passengerID], [userName], [emailAdd], [name], [language], [password], [mobileNumber]) VALUES (12, N'abd_393929', N'aoirenti@gmail.com', N'abdelrahamn', N'english', N'12345', N'0')
INSERT [dbo].[passenger] ([passengerID], [userName], [emailAdd], [name], [language], [password], [mobileNumber]) VALUES (20, N'abdullah_2000', N'abd@gmail.com', N'abdullah Saleh', N'english', N'0000', N'07888888888')
INSERT [dbo].[passenger] ([passengerID], [userName], [emailAdd], [name], [language], [password], [mobileNumber]) VALUES (123, N'ien', N'oqiwefp', N'sa', N'english', N'0987', N'9358')
INSERT [dbo].[passenger] ([passengerID], [userName], [emailAdd], [name], [language], [password], [mobileNumber]) VALUES (73482, N'rastenh', N'ienrsth', N'nearisth', N'enrath', N'arsienth', N'0')
GO
ALTER TABLE [dbo].[admin]  WITH CHECK ADD  CONSTRAINT [FK_admin_BusTrip] FOREIGN KEY([BusTripID])
REFERENCES [dbo].[busTrip] ([tripID])
GO
ALTER TABLE [dbo].[admin] CHECK CONSTRAINT [FK_admin_BusTrip]
GO
ALTER TABLE [dbo].[booking]  WITH CHECK ADD  CONSTRAINT [FK_booking_BusTrip] FOREIGN KEY([tripID])
REFERENCES [dbo].[busTrip] ([tripID])
GO
ALTER TABLE [dbo].[booking] CHECK CONSTRAINT [FK_booking_BusTrip]
GO
ALTER TABLE [dbo].[booking]  WITH CHECK ADD  CONSTRAINT [FK_booking_Passenger] FOREIGN KEY([passengerID])
REFERENCES [dbo].[passenger] ([passengerID])
GO
ALTER TABLE [dbo].[booking] CHECK CONSTRAINT [FK_booking_Passenger]
GO
ALTER TABLE [dbo].[passenger]  WITH CHECK ADD  CONSTRAINT [FK_passenger_book] FOREIGN KEY([passengerID])
REFERENCES [dbo].[passenger] ([passengerID])
GO
ALTER TABLE [dbo].[passenger] CHECK CONSTRAINT [FK_passenger_book]
GO
