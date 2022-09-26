-- ----------------------------
-- Table structure for chuyenbay
-- ----------------------------
DROP TABLE IF EXISTS chuyenbay;
CREATE TABLE chuyenbay (
  ma_cb varchar(5) NOT NULL,
  ga_di varchar(50) DEFAULT NULL,
  ga_den varchar(50) DEFAULT NULL,
  do_dai integer DEFAULT NULL,
  gio_di time DEFAULT NULL,
  gio_den time DEFAULT NULL,
  chi_phi integer DEFAULT NULL,
  PRIMARY KEY (ma_cb)
);

-- ----------------------------
-- Records of chuyenbay
-- ----------------------------
INSERT INTO chuyenbay VALUES ('VN216', 'SGN', 'DIN', '4170', '10:30:00', '14:20:00', '262');
INSERT INTO chuyenbay VALUES ('VN254', 'SGN', 'HUI', '8765', '18:40:00', '20:00:00', '781');
INSERT INTO chuyenbay VALUES ('VN269', 'HAN', 'CXR', '1262', '14:10:00', '15:50:00', '202');
INSERT INTO chuyenbay VALUES ('VN276', 'DAD', 'CXR', '1283', '09:00:00', '12:00:00', '203');
INSERT INTO chuyenbay VALUES ('VN280', 'SGN', 'HPH', '11979', '06:00:00', '08:00:00', '1279');
INSERT INTO chuyenbay VALUES ('VN315', 'HAN', 'DAD', '134', '11:45:00', '13:00:00', '112');
INSERT INTO chuyenbay VALUES ('VN317', 'HAN', 'UIH', '827', '15:00:00', '16:15:00', '190');
INSERT INTO chuyenbay VALUES ('VN320', 'SGN', 'DAD', '2798', '06:00:00', '07:10:00', '221');
INSERT INTO chuyenbay VALUES ('VN338', 'SGN', 'BMV', '4081', '15:25:00', '16:25:00', '375');
INSERT INTO chuyenbay VALUES ('VN374', 'HAN', 'VII', '510', '11:40:00', '13:25:00', '120');
INSERT INTO chuyenbay VALUES ('VN375', 'VII', 'CXR', '752', '14:15:00', '16:00:00', '181');
INSERT INTO chuyenbay VALUES ('VN431', 'SGN', 'CAH', '3693', '05:55:00', '06:55:00', '236');
INSERT INTO chuyenbay VALUES ('VN440', 'SGN', 'BMV', '4081', '18:30:00', '19:30:00', '426');
INSERT INTO chuyenbay VALUES ('VN464', 'SGN', 'DLI', '2002', '07:20:00', '08:05:00', '225');
INSERT INTO chuyenbay VALUES ('VN474', 'PXU', 'PQC', '1586', '08:40:00', '11:20:00', '102');
INSERT INTO chuyenbay VALUES ('VN476', 'UIH', 'PQC', '485', '09:15:00', '11:50:00', '117');
INSERT INTO chuyenbay VALUES ('VN651', 'DAD', 'SGN', '2798', '19:30:00', '08:00:00', '221');
INSERT INTO chuyenbay VALUES ('VN741', 'HAN', 'PXU', '395', '06:30:00', '08:30:00', '120');

-- ----------------------------
-- Table structure for maybay
-- ----------------------------
DROP TABLE IF EXISTS maybay;
CREATE TABLE maybay (
  ma_mb integer NOT NULL DEFAULT '0',
  loai varchar(50) DEFAULT NULL,
  tam_bay integer DEFAULT NULL,
  PRIMARY KEY (ma_mb)
);

-- ----------------------------
-- Records of maybay
-- ----------------------------
INSERT INTO maybay VALUES ('154', 'Tupolev 154', '6565');
INSERT INTO maybay VALUES ('319', 'Airbus A319', '2888');
INSERT INTO maybay VALUES ('320', 'Airbus A320', '4168');
INSERT INTO maybay VALUES ('340', 'Airbus A340 - 300', '11392');
INSERT INTO maybay VALUES ('727', 'Boeing 727', '2406');
INSERT INTO maybay VALUES ('737', 'Boeing 737 - 800', '5413');
INSERT INTO maybay VALUES ('747', 'Boeing 747 - 400', '13488');
INSERT INTO maybay VALUES ('757', 'Boeing 757 - 300', '6416');
INSERT INTO maybay VALUES ('767', 'Boeing 767 - 400ER', '10360');
INSERT INTO maybay VALUES ('777', 'Boeing 777 - 300', '10306');

-- ----------------------------
-- Table structure for nhanvien
-- ----------------------------
DROP TABLE IF EXISTS nhanvien;
CREATE TABLE nhanvien (
  ma_nv varchar(9) NOT NULL DEFAULT '',
  luong integer DEFAULT NULL,
  ten varchar(50) DEFAULT NULL,
  PRIMARY KEY (ma_nv)
);

-- ----------------------------
-- Records of nhanvien
-- ----------------------------
INSERT INTO nhanvien VALUES ('011564812', '153972', 'Ton Van Quy');
INSERT INTO nhanvien VALUES ('141582651', '178345', 'Doan Thi Mai');
INSERT INTO nhanvien VALUES ('142519864', '227489', 'Nguyen Thi Xuan Dao');
INSERT INTO nhanvien VALUES ('159542516', '48250', 'Le Van Ky');
INSERT INTO nhanvien VALUES ('242518965', '120433', 'Tran Van Son');
INSERT INTO nhanvien VALUES ('248965255', '43723', 'Tran Thi Ba');
INSERT INTO nhanvien VALUES ('254099823', '24450', 'Nguyen Thi Quynh');
INSERT INTO nhanvien VALUES ('269734834', '289950', 'Truong Tuan Anh');
INSERT INTO nhanvien VALUES ('274878974', '99890', 'Mai Quoc Minh');
INSERT INTO nhanvien VALUES ('287321212', '48090', 'Duong Van Minh');
INSERT INTO nhanvien VALUES ('310454876', '212156', 'Ta Van Do');
INSERT INTO nhanvien VALUES ('310454877', '33546', 'Tran Van Hao');
INSERT INTO nhanvien VALUES ('348121549', '32899', 'Nguyen Van Thanh');
INSERT INTO nhanvien VALUES ('355548984', '212156', 'Tran Thi Hoai An');
INSERT INTO nhanvien VALUES ('356187925', '44740', 'Nguyen Vinh Bao');
INSERT INTO nhanvien VALUES ('390487451', '212156', 'Le Van Luat');
INSERT INTO nhanvien VALUES ('489221823', '23980', 'Bui Quoc Chinh');
INSERT INTO nhanvien VALUES ('489456522', '127984', 'Nguyen Thi Quy Linh');
INSERT INTO nhanvien VALUES ('548977562', '84476', 'Le Van Quy');
INSERT INTO nhanvien VALUES ('550156548', '205187', 'Nguyen Thi Cam');
INSERT INTO nhanvien VALUES ('552455318', '101745', 'La Que');
INSERT INTO nhanvien VALUES ('552455348', '92013', 'Bui Thi Dung');
INSERT INTO nhanvien VALUES ('567354612', '256481', 'Quan Cam Ly');
INSERT INTO nhanvien VALUES ('574489457', '20', 'Dui Van Lap');

-- ----------------------------
-- Table structure for chungnhan
-- ----------------------------
DROP TABLE IF EXISTS chungnhan;
CREATE TABLE chungnhan (
  ma_mb integer NOT NULL DEFAULT '0',
  ma_nv varchar(9) NOT NULL DEFAULT '',
  PRIMARY KEY (ma_nv,ma_mb),
  CONSTRAINT FK_CN1 FOREIGN KEY (ma_nv) REFERENCES nhanvien (ma_nv),
  CONSTRAINT FK_CN2 FOREIGN KEY (ma_mb) REFERENCES maybay (ma_mb)
);

-- ----------------------------
-- Records of chungnhan
-- ----------------------------
INSERT INTO chungnhan VALUES ('154', '269734834');
INSERT INTO chungnhan VALUES ('154', '310454876');
INSERT INTO chungnhan VALUES ('154', '355548984');
INSERT INTO chungnhan VALUES ('154', '574489457');
INSERT INTO chungnhan VALUES ('319', '269734834');
INSERT INTO chungnhan VALUES ('319', '390487451');
INSERT INTO chungnhan VALUES ('319', '552455318');
INSERT INTO chungnhan VALUES ('320', '142519864');
INSERT INTO chungnhan VALUES ('320', '269734834');
INSERT INTO chungnhan VALUES ('320', '390487451');
INSERT INTO chungnhan VALUES ('320', '552455318');
INSERT INTO chungnhan VALUES ('340', '142519864');
INSERT INTO chungnhan VALUES ('340', '269734834');
INSERT INTO chungnhan VALUES ('340', '390487451');
INSERT INTO chungnhan VALUES ('340', '567354612');
INSERT INTO chungnhan VALUES ('727', '269734834');
INSERT INTO chungnhan VALUES ('727', '567354612');
INSERT INTO chungnhan VALUES ('737', '011564812');
INSERT INTO chungnhan VALUES ('737', '141582651');
INSERT INTO chungnhan VALUES ('737', '142519864');
INSERT INTO chungnhan VALUES ('737', '242518965');
INSERT INTO chungnhan VALUES ('737', '269734834');
INSERT INTO chungnhan VALUES ('737', '552455318');
INSERT INTO chungnhan VALUES ('737', '567354612');
INSERT INTO chungnhan VALUES ('747', '142519864');
INSERT INTO chungnhan VALUES ('747', '269734834');
INSERT INTO chungnhan VALUES ('747', '567354612');
INSERT INTO chungnhan VALUES ('757', '011564812');
INSERT INTO chungnhan VALUES ('757', '141582651');
INSERT INTO chungnhan VALUES ('757', '142519864');
INSERT INTO chungnhan VALUES ('757', '242518965');
INSERT INTO chungnhan VALUES ('757', '269734834');
INSERT INTO chungnhan VALUES ('757', '274878974');
INSERT INTO chungnhan VALUES ('757', '567354612');
INSERT INTO chungnhan VALUES ('767', '141582651');
INSERT INTO chungnhan VALUES ('767', '142519864');
INSERT INTO chungnhan VALUES ('767', '269734834');
INSERT INTO chungnhan VALUES ('767', '274878974');
INSERT INTO chungnhan VALUES ('767', '552455318');
INSERT INTO chungnhan VALUES ('767', '567354612');
INSERT INTO chungnhan VALUES ('777', '142519864');
INSERT INTO chungnhan VALUES ('777', '269734834');
INSERT INTO chungnhan VALUES ('777', '567354612');

