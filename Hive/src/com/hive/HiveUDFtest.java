package com.hive;
/*
 * Scenario
 * 1. Table:create table tlist_db(tid string,cname string, ctype string, cnum bigint, cexp string,amt double, tdate string, pid string, fname string, lname string) row format delimited fields terminated by ',' Location '/home/mapreduce/output/';
 * 2. Paritition: based on date ( creates 100s of folders related to specific date)
 * 		<can be done by using existing table>
 * 		drop table if exists tlist_db;
 * 		hive> create table tlist_db(tid string,cnaparme string, ctype string, cnum bigint, cexp string,amt double, tdate string, pid string, fname string, lname string) partitioned by (sdate string) row format delimited fields terminated by ',' Location '/home/mapreduce/output/';
 *		hive> set hive.exec.dynamic.partition=true;
 *		hive> set hive.exec.dynamic.partition.mode=nonstrict;
 *
 *	basically to load:
 *	create table part_tlist_db(tid string,cnaparme string, ctype string, cnum bigint, cexp string,amt double, tdate string, pid string, fname string, lname string) partitioned by (sdate string) row format delimited fields terminated by ',' Location '/home/mapreduce/output/';
*	OK
*	Time taken: 0.041 seconds
*	hive> insert overwrite table part_tlist_db
 *   > partition (sdate)
  *  > select *, SUBSTR(tdate,1,10) from tlist_db;
  *  parition the date based on customers
 *
 * 3. Buckets: divide them in to 10 buckets, which has 10 folders, and then partition based on date.
 * 
 * hive> create table buc_tlist_db(tid string,cnaparme string, ctype string, cnum bigint, cexp string,amt double, tdate string, pid string, fname string, lname string) clustered by (pid) into 5 buckets;
OK
 * 4. UDF
 * 	public final class upper extends UDF  - UDF is abstract class
 * { 
 * public Text evaluate(final Text s)
 * {  bl
 * 	 deserialize, apply java logic, return
 * 	 calculate pf ?
 * }}
 * hive> add jar hiveudf.jar   
 *	hive>create temporary function myupper as 'com.hive.hiveudf'
 *
 *
 *
 * 1. read format date and read the persons who has number of transactions greater than 2
 * 2. store the values based on date..
 * 		1. store based on date and search for specific customer <partition>
 * 
 *		2. store as buckets for a particular year or month <bucketing>
 *
 *	3. write java to group by and display values greater than 1
 */

class HiveUDFtest extends hiveudf{

}
