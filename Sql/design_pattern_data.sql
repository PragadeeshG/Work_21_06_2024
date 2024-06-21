create table if not exists design_pattern_data(
pattern_code varchar(255) not null,
pattern_name varchar(255) null,
localenvironment varchar(255) null,
tradeenvironment varchar(255) null,
short_description varchar(255) null,
multi_pattern_option varchar(255) null,
pattern_params varchar(255) null,
upload_version Integer null,
launch_environment varchar(255) null,
manage_environment varchar(255) null,
status varchar(255) null,
constraint design_pattern_data_pk primary key(pattern_code));