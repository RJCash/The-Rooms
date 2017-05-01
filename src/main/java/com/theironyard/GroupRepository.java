package com.theironyard;
import org.springframework.stereotype.Component;

/**
 * Created by rickiecashwell on 4/28/17.
 */
@Component
public class GroupRepository {

   public void insertJSON(){

         String json1 = "[\n" +
               "   {\n" +
               "      \"name\":\"Sobriety First\",\n" +
               "      \"slug\":\"1\",\n" +
               "      \"notes\":\"4th Sunday each Month is Open Speaker Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=1\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"725 N Boylan Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7897425818507\",\n" +
               "      \"longitude\":\"-78.6488592625\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Jenkins Memorial Methodist Church\",\n" +
               "      \"location_notes\":\"between Peace &amp; Wills Forest\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Morning Meditation Group\",\n" +
               "      \"slug\":\"2\",\n" +
               "      \"notes\":\"Open 11th Step Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=2\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Morning Meditation Group\",\n" +
               "      \"slug\":\"3\",\n" +
               "      \"notes\":\"Open 11th Step Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=3\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Non Smoking Group\",\n" +
               "      \"slug\":\"4\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=4\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1520 Canterbury Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.809252\",\n" +
               "      \"longitude\":\"-78.667364\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Michael`s Episcopal Church\",\n" +
               "      \"location_notes\":\"Off Wade avenue between Oberlin and the Beltline \"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Morning Meditation Group\",\n" +
               "      \"slug\":\"6\",\n" +
               "      \"notes\":\"Open 11th Step Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=6\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Morning Meditation Group\",\n" +
               "      \"slug\":\"7\",\n" +
               "      \"notes\":\"Open 11th Step Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=7\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Morning Meditation Group\",\n" +
               "      \"slug\":\"8\",\n" +
               "      \"notes\":\"Open 11th Step Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=8\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Morning Meditation Group\",\n" +
               "      \"slug\":\"9\",\n" +
               "      \"notes\":\"Open 11th Step Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=9\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Greenwood Forest Group\",\n" +
               "      \"slug\":\"10\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=10\",\n" +
               "      \"time\":\"08:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Greenwood Forest Group\",\n" +
               "      \"slug\":\"13\",\n" +
               "      \"notes\":\"Women`s Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=13\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"W\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Greenwood Forest Group\",\n" +
               "      \"slug\":\"12\",\n" +
               "      \"notes\":\"Men`s Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=12\",\n" +
               "      \"time\":\"10:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"M\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Apex Group\",\n" +
               "      \"slug\":\"15\",\n" +
               "      \"notes\":\"1st and 3rd Sundays of the Month - Open discussion meeting <br><br />2nd and last Sundays - Open Speaker meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=15\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"408 E Williams St\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27539\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.725129\",\n" +
               "      \"longitude\":\"-78.849125\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Apex Masonic Lodge\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"18\",\n" +
               "      \"notes\":\"Open Speaker 2nd and Last Sundays\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=18\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Louisburg 12 Step Group\",\n" +
               "      \"slug\":\"19\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=19\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"302 North Main St\",\n" +
               "      \"city\":\"Louisburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27549\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.101387\",\n" +
               "      \"longitude\":\"-78.29915\",\n" +
               "      \"region\":\"Louisburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Louisburg Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Came to Believe Meeting\",\n" +
               "      \"slug\":\"20\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=20\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Spiritual Meeting\",\n" +
               "      \"slug\":\"21\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=21\",\n" +
               "      \"time\":\"11:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Place of Miracles Meeting\",\n" +
               "      \"slug\":\"22\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=22\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Hills Group\",\n" +
               "      \"slug\":\"23\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=23\",\n" +
               "      \"time\":\"14:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4523 Six Forks Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841804\",\n" +
               "      \"longitude\":\"-78.644\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Timothy`s Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Weekender`s Meeting\",\n" +
               "      \"slug\":\"24\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=24\",\n" +
               "      \"time\":\"17:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Longview Group\",\n" +
               "      \"slug\":\"25\",\n" +
               "      \"notes\":\"1st Sunday Open Discussion<br />2nd Sunday Open Speaker\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=25\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1950 New Bern Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.778678\",\n" +
               "      \"longitude\":\"-78.608696\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Milner Memorial Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Valley Group\",\n" +
               "      \"slug\":\"26\",\n" +
               "      \"notes\":\"Beginners Meeting Same Time<BR><br />Last Sunday Open Speaker Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=26\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5101 Oak Park Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27612\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8542135521102\",\n" +
               "      \"longitude\":\"-78.7038767338\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Giles Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Westminster Group\",\n" +
               "      \"slug\":\"27\",\n" +
               "      \"notes\":\"TWO MEETINGS AT 8 PM:<BR><BR><br />Open Discussion<br><br />Beginners Group meets at the same time in a different room<br><br>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=27\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"301 East Whitaker Mill Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8078773435826\",\n" +
               "      \"longitude\":\"-78.6376905441\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Westminister Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Willow Springs Group\",\n" +
               "      \"slug\":\"28\",\n" +
               "      \"notes\":\"Beginners Meeting<br /> - first three steps and sponsorship<br /><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=28\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"402 N Main St\",\n" +
               "      \"city\":\"Fuquay-Varina\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.58908\",\n" +
               "      \"longitude\":\"-78.798624\",\n" +
               "      \"region\":\"Fuquay-Varina\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"First United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Willow Springs Group\",\n" +
               "      \"slug\":\"29\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=29\",\n" +
               "      \"time\":\"19:01:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"402 N Main St\",\n" +
               "      \"city\":\"Fuquay-Varina\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.58908\",\n" +
               "      \"longitude\":\"-78.798624\",\n" +
               "      \"region\":\"Fuquay-Varina\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"First United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Zebulon Group\",\n" +
               "      \"slug\":\"30\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=30\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"118 W Sycamore St\",\n" +
               "      \"city\":\"Zebulon\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27597\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.823383\",\n" +
               "      \"longitude\":\"-78.315995\",\n" +
               "      \"region\":\"Zebulon\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Zebulon Methodist Church\",\n" +
               "      \"location_notes\":\"Corner of Gannon Ave. & Church St.\"\n" +
                 "   },\n";

       String json2 =  "{\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"32\",\n" +
               "      \"notes\":\"As Bill Sees It<br><br /><br><br />Some participants break out into a BEGINNERS MEETING. \",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=32\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"34\",\n" +
               "      \"notes\":\"As Bill Sees It\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=34\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Reaching Out Group\",\n" +
               "      \"slug\":\"38\",\n" +
               "      \"notes\":\"1st-12 & 12<br>2nd-Discussion<br>3rd-Traditions<br>4th-Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=38\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"111 Lee Court\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.658597\",\n" +
               "      \"longitude\":\"-78.463633\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Grace Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Franklinton Evergreen Group\",\n" +
               "      \"slug\":\"39\",\n" +
               "      \"notes\":\"1st and 3rd Monday-Closed Discussion<br />2nd and 4th Monday-Big Book Study<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=39\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"102 West Mason St\",\n" +
               "      \"city\":\"Franklinton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27525\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.104381\",\n" +
               "      \"longitude\":\"-78.458659\",\n" +
               "      \"region\":\"Franklinton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Franklinton Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Lakeside Group\",\n" +
               "      \"slug\":\"40\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=40\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"503 Lakeside Dr\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.697873\",\n" +
               "      \"longitude\":\"-78.611319\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"First Presbyterian Church-Garner\",\n" +
               "      \"location_notes\":\"Corner of Lakeside Dr. & Hwy. 50<br>Meets Upstairs\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Maynard Road Group\",\n" +
               "      \"slug\":\"37\",\n" +
               "      \"notes\":\"Beginners Discussion - Steps 1,2,3 / <br />4th Monday - Open Speaker Meeting (with Book Raffle)\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=37\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"110 SE Maynard Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.770437\",\n" +
               "      \"longitude\":\"-78.780783\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Greenwood Forest Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"41\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=41\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"New Start Group\",\n" +
               "      \"slug\":\"42\",\n" +
               "      \"notes\":\"This location is NOT handicapped accessible.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=42\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"210 S Chestnut St\",\n" +
               "      \"city\":\"Henderson\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27536\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.328264\",\n" +
               "      \"longitude\":\"-78.40579\",\n" +
               "      \"region\":\"Henderson\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Church of the Holy Innocents\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Knightdale Group\",\n" +
               "      \"slug\":\"43\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=43\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"7071 Forestville Rd\",\n" +
               "      \"city\":\"Knightdale\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27545\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.810183\",\n" +
               "      \"longitude\":\"-78.486822\",\n" +
               "      \"region\":\"Knightdale\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Knightdale United Methodist Church\",\n" +
               "      \"location_notes\":\"Church Annex\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Early Risers Group\",\n" +
               "      \"slug\":\"45\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=45\",\n" +
               "      \"time\":\"10:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"2312 Milburnie Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.789083\",\n" +
               "      \"longitude\":\"-78.605057\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Longview Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"First Things First Meeting\",\n" +
               "      \"slug\":\"46\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=46\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"47\",\n" +
               "      \"notes\":\"Open Discussion/Beginners Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=47\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Oasis Group\",\n" +
               "      \"slug\":\"48\",\n" +
               "      \"notes\":\"Monday is step/Tradition (closed) with Tradition Meetings on the first Monday of each month\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=48\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"7506 Falls of the Neuse Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.886592\",\n" +
               "      \"longitude\":\"-78.62663\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Andrews Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Place of Miracles Meeting\",\n" +
               "      \"slug\":\"49\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=49\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Happy Hour Meeting\",\n" +
               "      \"slug\":\"50\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=50\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"51\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=51\",\n" +
               "      \"time\":\"17:45:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Jenkins Group\",\n" +
               "      \"slug\":\"52\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=52\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"725 N Boylan Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7897425818507\",\n" +
               "      \"longitude\":\"-78.6488592625\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Jenkins Memorial Methodist Church\",\n" +
               "      \"location_notes\":\"between Peace &amp; Wills Forest\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Women`s Group\",\n" +
               "      \"slug\":\"54\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=54\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"7509 Leadmine Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8843214868599\",\n" +
               "      \"longitude\":\"-78.6607146263\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Greystone Baptist Church\",\n" +
               "      \"location_notes\":\"Corner of Leadmine and Sawmill Rd\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"2001 Group\",\n" +
               "      \"slug\":\"55\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=55\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Hayes Barton Group\",\n" +
               "      \"slug\":\"56\",\n" +
               "      \"notes\":\"Beginners Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=56\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"1704 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.806635\",\n" +
               "      \"longitude\":\"-78.655509\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"White Memorial Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Brickhouse Group\",\n" +
               "      \"slug\":\"58\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=58\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"7509 Leadmine Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8843214868599\",\n" +
               "      \"longitude\":\"-78.6607146263\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Greystone Baptist Church\",\n" +
               "      \"location_notes\":\"Corner of Leadmine and Sawmill Rd\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Fairview Group\",\n" +
               "      \"slug\":\"59\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=59\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"2011 Ridge Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.818015\",\n" +
               "      \"longitude\":\"-78.68077\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ridge Road Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gratitude Study Group\",\n" +
               "      \"slug\":\"60\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=60\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"99 N Salisbury St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.781059\",\n" +
               "      \"longitude\":\"-78.640849\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"First Baptist Church\",\n" +
               "      \"location_notes\":\"Enter the building from the covered walkway in the parking lot that borders McDowell Street. This parking lot can only be accessed from Hillsborough or Edenton Streets.\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Sunlight of the Spirit\",\n" +
               "      \"slug\":\"517\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=517\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Oak City Speakers Group\",\n" +
               "      \"slug\":\"518\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=518\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"3313 Wade Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800538\",\n" +
               "      \"longitude\":\"-78.67978\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Unitarian Universalist Fellowship of Raleigh\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Ladies Into Action \",\n" +
               "      \"slug\":\"519\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=519\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\",\n" +
               "         \"W\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Hayes Barton Group\",\n" +
               "      \"slug\":\"62\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=62\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1704 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.806635\",\n" +
               "      \"longitude\":\"-78.655509\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"White Memorial Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Millbrook Step Study Group\",\n" +
               "      \"slug\":\"63\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=63\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"1712 E Millbrook Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.849589\",\n" +
               "      \"longitude\":\"-78.606856\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Millbrook United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"64\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=64\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Ladies Into Action\",\n" +
               "      \"slug\":\"510\",\n" +
               "      \"notes\":\"<BR> CANDLELIGHT MEETING<br><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=510\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Mitchell Mill Group\",\n" +
               "      \"slug\":\"66\",\n" +
               "      \"notes\":\"Last Monday Traditions\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=66\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"2405 Wait Ave\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.962086\",\n" +
               "      \"longitude\":\"-78.449127\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Grace Assembly\",\n" +
               "      \"location_notes\":\"Handicap Accessible\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Green Level Group\",\n" +
               "      \"slug\":\"68\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=68\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"8509 Green Level Church Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27519\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.782395\",\n" +
               "      \"longitude\":\"-78.904231\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Green Level Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"70\",\n" +
               "      \"notes\":\"Grapevine<br><br /><br><br />Some participants break out into a BEGINNERS MEETING. \",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=70\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Clayton Big Book\",\n" +
               "      \"slug\":\"73\",\n" +
               "      \"notes\":\"As Bill Sees It, Beginners meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=73\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"121 E Second St\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.780214\",\n" +
               "      \"longitude\":\"-78.3687\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Horne Memorial United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Garner Big Book Group\",\n" +
               "      \"slug\":\"74\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=74\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4926 Fayetteville Rd\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.713206\",\n" +
               "      \"longitude\":\"-78.657993\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ernest Myatt Presbyterian Church\",\n" +
               "      \"location_notes\":\"Meeting in Fellowship hall\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"75\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=75\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"New Start Group\",\n" +
               "      \"slug\":\"76\",\n" +
               "      \"notes\":\"This location is NOT handicapped accessible.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=76\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"210 S Chestnut St\",\n" +
               "      \"city\":\"Henderson\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27536\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.328264\",\n" +
               "      \"longitude\":\"-78.40579\",\n" +
               "      \"region\":\"Henderson\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Church of the Holy Innocents\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"77\",\n" +
               "      \"notes\":\"Step/Traditions\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=77\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Louisburg Spanish AA Meeting\",\n" +
               "      \"slug\":\"78\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=78\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"937 N Main St\",\n" +
               "      \"city\":\"Louisburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27549\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.114328\",\n" +
               "      \"longitude\":\"-78.295676\",\n" +
               "      \"region\":\"Louisburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Our Lady of the Rosary Roman Catholic Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"First Things First Meeting\",\n" +
               "      \"slug\":\"79\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=79\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"80\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=80\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Tuesday - Thursday-Nooners\",\n" +
               "      \"slug\":\"81\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=81\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"718 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.781156\",\n" +
               "      \"longitude\":\"-78.649987\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hillyer Memorial\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Place of Miracles Meeting\",\n" +
               "      \"slug\":\"82\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=82\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
                 "   },\n";

       String json3 =  "{\n" +
               "      \"name\":\"Happy Hour Meeting\",\n" +
               "      \"slug\":\"83\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=83\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"84\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=84\",\n" +
               "      \"time\":\"17:45:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Big Book Group\",\n" +
               "      \"slug\":\"85\",\n" +
               "      \"notes\":\"Beginners Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=85\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"2723 Clark Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.790897\",\n" +
               "      \"longitude\":\"-78.672735\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Holy Trinity Lutheran Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Big Book Group\",\n" +
               "      \"slug\":\"86\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=86\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"2723 Clark Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.790897\",\n" +
               "      \"longitude\":\"-78.672735\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Holy Trinity Lutheran Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Crabtree Discussion Group\",\n" +
               "      \"slug\":\"87\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=87\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1901 Ridge Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.815441\",\n" +
               "      \"longitude\":\"-78.682361\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Highland United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Downtown Group\",\n" +
               "      \"slug\":\"88\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=88\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"124 S Salisbury St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27601\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.77871\",\n" +
               "      \"longitude\":\"-78.640412\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"124 S Salisbury St\",\n" +
               "      \"location_notes\":\"Meeting Downstairs\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Light Group\",\n" +
               "      \"slug\":\"90\",\n" +
               "      \"notes\":\"Closed Step/Closed Big Book Study\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=90\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"1801 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.785121\",\n" +
               "      \"longitude\":\"-78.660926\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Pullen Memorial Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
                 "   },\n" +
                 "   {\n" +
               "      \"name\":\"Green Level Group\",\n" +
               "      \"slug\":\"92\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=92\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"8509 Green Level Church Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27519\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.782395\",\n" +
               "      \"longitude\":\"-78.904231\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Green Level Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"95\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=95\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Cary 12 Step Group\",\n" +
               "      \"slug\":\"153\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=153\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"221 Union St\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7799947426702\",\n" +
               "      \"longitude\":\"-78.7915205956\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Pauls Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Clayton Big Book\",\n" +
               "      \"slug\":\"98\",\n" +
               "      \"notes\":\"LAST THURSDAY OF THE MONTH IS OPEN SPEAKER   \",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=98\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"121 E Second St\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.780214\",\n" +
               "      \"longitude\":\"-78.3687\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Horne Memorial United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"100\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=100\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"101\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=101\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Early Risers Group\",\n" +
               "      \"slug\":\"102\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=102\",\n" +
               "      \"time\":\"10:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"2312 Milburnie Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.789083\",\n" +
               "      \"longitude\":\"-78.605057\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Longview Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"First Things First Meeting\",\n" +
               "      \"slug\":\"103\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=103\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"104\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=104\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Tuesday - Thursday-Nooners\",\n" +
               "      \"slug\":\"105\",\n" +
               "      \"notes\":\"Last Thursday - Traditions\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=105\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"718 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.781156\",\n" +
               "      \"longitude\":\"-78.649987\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hillyer Memorial\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Place of Miracles Meeting\",\n" +
               "      \"slug\":\"106\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=106\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Happy Hour Meeting\",\n" +
               "      \"slug\":\"107\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=107\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"108\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=108\",\n" +
               "      \"time\":\"17:45:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Big Book Group\",\n" +
               "      \"slug\":\"109\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=109\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"2723 Clark Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.790897\",\n" +
               "      \"longitude\":\"-78.672735\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Holy Trinity Lutheran Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Fairview Group\",\n" +
               "      \"slug\":\"110\",\n" +
               "      \"notes\":\"Every 4th Thursday of the month is an Open Speaker meeting.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=110\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"2011 Ridge Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.818015\",\n" +
               "      \"longitude\":\"-78.68077\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ridge Road Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gratitude Study Group\",\n" +
               "      \"slug\":\"111\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=111\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"99 N Salisbury St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.781059\",\n" +
               "      \"longitude\":\"-78.640849\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"First Baptist Church\",\n" +
               "      \"location_notes\":\"Enter the building from the covered walkway in the parking lot that borders McDowell Street. This parking lot can only be accessed from Hillsborough or Edenton Streets.\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Principles Group\",\n" +
               "      \"slug\":\"112\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=112\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"1725 North New Hope Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804149\",\n" +
               "      \"longitude\":\"-78.56522\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Mark`s Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Twelve & Twelve Group\",\n" +
               "      \"slug\":\"113\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=113\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4921 Six Forks Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.848868\",\n" +
               "      \"longitude\":\"-78.645003\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hudson Memorial Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wake Forest Group\",\n" +
               "      \"slug\":\"114\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=114\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Willow Springs Group\",\n" +
               "      \"slug\":\"115\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=115\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"402 N Main St\",\n" +
               "      \"city\":\"Fuquay-Varina\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.58908\",\n" +
               "      \"longitude\":\"-78.798624\",\n" +
               "      \"region\":\"Fuquay-Varina\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"First United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Mitchell Mill Group\",\n" +
               "      \"slug\":\"116\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=116\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"2405 Wait Ave\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.962086\",\n" +
               "      \"longitude\":\"-78.449127\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Grace Assembly\",\n" +
               "      \"location_notes\":\"Handicap Accessible\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"118\",\n" +
               "      \"notes\":\"<br />Some participants break out into a BEGINNERS MEETING. \",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=118\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Young People`s Group\",\n" +
               "      \"slug\":\"222\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=222\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"7304 Falls of the Neuse Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.884552\",\n" +
               "      \"longitude\":\"-78.625865\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Phillip Lutheran Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Apex Group\",\n" +
               "      \"slug\":\"121\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=121\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"408 E Williams St\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27539\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.725129\",\n" +
               "      \"longitude\":\"-78.849125\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Apex Masonic Lodge\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"122\",\n" +
               "      \"notes\":\"Beginners Meeting Steps 1,2 & 3\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=122\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"North East Street Group\",\n" +
               "      \"slug\":\"221\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=221\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"10 North East St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27601\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78026\",\n" +
               "      \"longitude\":\"-78.632254\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Emmaus House\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Greenwood Forest Group\",\n" +
               "      \"slug\":\"124\",\n" +
               "      \"notes\":\"Beginners Meeting <br><br />Two 10 minute speakers then sobriety count-up<br><br />to give newcomers the opportunity to share.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=124\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\",\n" +
               "         \"X\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"126\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=126\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"New Start Group\",\n" +
               "      \"slug\":\"127\",\n" +
               "      \"notes\":\"This meeting is NOT handicapped accessible.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=127\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"210 S Chestnut St\",\n" +
               "      \"city\":\"Henderson\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27536\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.328264\",\n" +
               "      \"longitude\":\"-78.40579\",\n" +
               "      \"region\":\"Henderson\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Church of the Holy Innocents\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Knightdale Group\",\n" +
               "      \"slug\":\"128\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=128\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"7071 Forestville Rd\",\n" +
               "      \"city\":\"Knightdale\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27545\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.810183\",\n" +
               "      \"longitude\":\"-78.486822\",\n" +
               "      \"region\":\"Knightdale\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Knightdale United Methodist Church\",\n" +
               "      \"location_notes\":\"Church Annex\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"129\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=129\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Place of Miracles Meeting\",\n" +
               "      \"slug\":\"130\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=130\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Oasis Group\",\n" +
               "      \"slug\":\"131\",\n" +
               "      \"notes\":\"Friday we have both a discussion and beginners/newcomers meeting (both closed meetings)\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=131\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"7506 Falls of the Neuse Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.886592\",\n" +
               "      \"longitude\":\"-78.62663\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Andrews Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Happy Hour Meeting\",\n" +
               "      \"slug\":\"132\",\n" +
               "      \"notes\":\"Last Friday-OS\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=132\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"133\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=133\",\n" +
               "      \"time\":\"17:45:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Brickhouse Group\",\n" +
               "      \"slug\":\"134\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=134\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"7509 Leadmine Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8843214868599\",\n" +
               "      \"longitude\":\"-78.6607146263\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Greystone Baptist Church\",\n" +
               "      \"location_notes\":\"Corner of Leadmine and Sawmill Rd\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Downtown Group\",\n" +
               "      \"slug\":\"135\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=135\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"124 S Salisbury St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27601\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.77871\",\n" +
               "      \"longitude\":\"-78.640412\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"124 S Salisbury St\",\n" +
               "      \"location_notes\":\"Meeting Downstairs\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Hayes Barton Group\",\n" +
               "      \"slug\":\"136\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=136\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"1704 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.806635\",\n" +
               "      \"longitude\":\"-78.655509\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"White Memorial Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Westminster Group\",\n" +
               "      \"slug\":\"137\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=137\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"301 East Whitaker Mill Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8078773435826\",\n" +
               "      \"longitude\":\"-78.6376905441\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Westminister Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Promises Of A New Beginning Group\",\n" +
               "      \"slug\":\"238\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=238\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"201 Methodist Dr\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7101409101237\",\n" +
               "      \"longitude\":\"-78.6203634739\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Garner United Methodist Church\",\n" +
               "      \"location_notes\":\"at Hwy 70\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Warren County Group\",\n" +
               "      \"slug\":\"139\",\n" +
               "      \"notes\":\"Open Step / Closed Big Book Study<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=139\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"210 N Main St\",\n" +
               "      \"city\":\"Warrenton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27589\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.400281\",\n" +
               "      \"longitude\":\"-78.153941\",\n" +
               "      \"region\":\"Warrenton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wesley Memorial Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Zebulon Group\",\n" +
               "      \"slug\":\"140\",\n" +
               "      \"notes\":\"2nd Friday-OS\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=140\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"118 W Sycamore St\",\n" +
               "      \"city\":\"Zebulon\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27597\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.823383\",\n" +
               "      \"longitude\":\"-78.315995\",\n" +
               "      \"region\":\"Zebulon\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Zebulon Methodist Church\",\n" +
               "      \"location_notes\":\"Corner of Gannon Ave. & Church St.\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Apex Group\",\n" +
               "      \"slug\":\"155\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=155\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"408 E Williams St\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27539\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.725129\",\n" +
               "      \"longitude\":\"-78.849125\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Apex Masonic Lodge\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"156\",\n" +
               "      \"notes\":\"<br><br /><br><br />Some participants break out into a BEGINNERS MEETING. \",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=156\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"157\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=157\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n";

       String json4 =  "{\n" +
               "      \"name\":\"Sobriety First\",\n" +
               "      \"slug\":\"252\",\n" +
               "      \"notes\":\"Literature Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=252\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\"\n" +
               "      ],\n" +
               "      \"address\":\"725 N Boylan Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7897425818507\",\n" +
               "      \"longitude\":\"-78.6488592625\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Jenkins Memorial Methodist Church\",\n" +
               "      \"location_notes\":\"between Peace &amp; Wills Forest\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"One Day at a Time\",\n" +
               "      \"slug\":\"160\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=160\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"600 Walnut St\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.774459\",\n" +
               "      \"longitude\":\"-78.76788\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Christ the King Lutheran Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Fuquay-Varina Group\",\n" +
               "      \"slug\":\"162\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=162\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"401 S Main St\",\n" +
               "      \"city\":\"Fuquay-Varina\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27526\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.580306\",\n" +
               "      \"longitude\":\"-78.799772\",\n" +
               "      \"region\":\"Fuquay-Varina\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Fellowship Bible Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"163\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=163\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Louisburg 12 Step Group\",\n" +
               "      \"slug\":\"165\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=165\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"302 North Main St\",\n" +
               "      \"city\":\"Louisburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27549\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.101387\",\n" +
               "      \"longitude\":\"-78.29915\",\n" +
               "      \"region\":\"Louisburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Louisburg Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Early Risers Group\",\n" +
               "      \"slug\":\"166\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=166\",\n" +
               "      \"time\":\"10:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"2312 Milburnie Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.789083\",\n" +
               "      \"longitude\":\"-78.605057\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Longview Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"First Things First Meeting\",\n" +
               "      \"slug\":\"167\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=167\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"168\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=168\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Oasis Group\",\n" +
               "      \"slug\":\"169\",\n" +
               "      \"notes\":\"Wednesday is a Speaker meeting (open)\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=169\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"7506 Falls of the Neuse Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.886592\",\n" +
               "      \"longitude\":\"-78.62663\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Andrews Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Place of Miracles Meeting\",\n" +
               "      \"slug\":\"170\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=170\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Happy Hour Meeting\",\n" +
               "      \"slug\":\"171\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=171\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"172\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=172\",\n" +
               "      \"time\":\"17:45:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"2001 Group\",\n" +
               "      \"slug\":\"173\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=173\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Men`s Meeting\",\n" +
               "      \"slug\":\"174\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=174\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Longview Group\",\n" +
               "      \"slug\":\"175\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=175\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1950 New Bern Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.778678\",\n" +
               "      \"longitude\":\"-78.608696\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Milner Memorial Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"North Raleigh Group\",\n" +
               "      \"slug\":\"176\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=176\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"10301 Old Creedmoor Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.932303\",\n" +
               "      \"longitude\":\"-78.692939\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Soapstone Chapel\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Spanish Meeting\",\n" +
               "      \"slug\":\"177\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=177\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5801 Falls of Neuse Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.859061\",\n" +
               "      \"longitude\":\"-78.618202\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Raphael Catholic Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Valley Group\",\n" +
               "      \"slug\":\"178\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=178\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5101 Oak Park Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27612\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8542135521102\",\n" +
               "      \"longitude\":\"-78.7038767338\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Giles Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Progress Not Perfection\",\n" +
               "      \"slug\":\"179\",\n" +
               "      \"notes\":\"Last Wed. Open Speaker\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=179\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"2718 Overbrook Dr\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.819407\",\n" +
               "      \"longitude\":\"-78.634325\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Our Lady of Lourdes Church\",\n" +
               "      \"location_notes\":\"Meets in Fallon Center, Rm. 202\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"180\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=180\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"\",\n" +
               "      \"slug\":\"181\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=181\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wendell Group\",\n" +
               "      \"slug\":\"182\",\n" +
               "      \"notes\":\"Last Wed Open Speaker\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=182\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"125 Selma Rd\",\n" +
               "      \"city\":\"Wendell\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27591\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.778844\",\n" +
               "      \"longitude\":\"-78.361539\",\n" +
               "      \"region\":\"Wendell\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Covenant Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Morning Meditation Group\",\n" +
               "      \"slug\":\"183\",\n" +
               "      \"notes\":\"Open 11th Step Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=183\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"513\",\n" +
               "      \"notes\":\"Beginners literature meeting. \",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=513\",\n" +
               "      \"time\":\"09:15:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Change Agents\",\n" +
               "      \"slug\":\"506\",\n" +
               "      \"notes\":\"1st Sunday of each month is Open Speaker<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=506\",\n" +
               "      \"time\":\"19:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"300 Powell Drive\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.788163\",\n" +
               "      \"longitude\":\"-78.713487\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Westover Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"\",\n" +
               "      \"slug\":\"507\",\n" +
               "      \"notes\":\"Last Monday of each month is an Open Speaker Meeting<br /><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=507\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"\",\n" +
               "      \"slug\":\"509\",\n" +
               "      \"notes\":\"Meeting Format is Chairperson`s Choice\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=509\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Youngsville Group\",\n" +
               "      \"slug\":\"185\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=185\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"315 E Main St\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.025516\",\n" +
               "      \"longitude\":\"-78.471289\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Youngsville Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"186\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=186\",\n" +
               "      \"time\":\"08:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Cary Young People`s Group\",\n" +
               "      \"slug\":\"188\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=188\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Garner Big Book Group\",\n" +
               "      \"slug\":\"189\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=189\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"4926 Fayetteville Rd\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.713206\",\n" +
               "      \"longitude\":\"-78.657993\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ernest Myatt Presbyterian Church\",\n" +
               "      \"location_notes\":\"Meeting in Fellowship hall\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Henderson Central Group\",\n" +
               "      \"slug\":\"190\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=190\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4815 Hwy 39\",\n" +
               "      \"city\":\"Gillburg\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27537\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.276536\",\n" +
               "      \"longitude\":\"-78.3683297\",\n" +
               "      \"region\":\"Gillburg\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gillburg United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Keep It Simple Meeting\",\n" +
               "      \"slug\":\"191\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=191\",\n" +
               "      \"time\":\"08:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"192\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=192\",\n" +
               "      \"time\":\"08:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Saturday Morning Woman`s Group\",\n" +
               "      \"slug\":\"193\",\n" +
               "      \"notes\":\"Speaker Last Sat. of Month\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=193\",\n" +
               "      \"time\":\"09:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"North Raleigh Group\",\n" +
               "      \"slug\":\"194\",\n" +
               "      \"notes\":\"Men`s Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=194\",\n" +
               "      \"time\":\"10:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"M\"\n" +
               "      ],\n" +
               "      \"address\":\"10301 Old Creedmoor Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.932303\",\n" +
               "      \"longitude\":\"-78.692939\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Soapstone Chapel\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"195\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=195\",\n" +
               "      \"time\":\"10:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Place of Miracles Meeting\",\n" +
               "      \"slug\":\"196\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=196\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Weekender`s Meeting\",\n" +
               "      \"slug\":\"197\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=197\",\n" +
               "      \"time\":\"17:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"2001 Group\",\n" +
               "      \"slug\":\"198\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=198\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Cameron Village Candlelight Group\",\n" +
               "      \"slug\":\"199\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=199\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"2501 Clark Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.789458\",\n" +
               "      \"longitude\":\"-78.667673\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Fairmont United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Crabtree Discussion Group\",\n" +
               "      \"slug\":\"200\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=200\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1901 Ridge Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.815441\",\n" +
               "      \"longitude\":\"-78.682361\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Highland United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Primary Purpose Group of Raleigh\",\n" +
               "      \"slug\":\"544\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=544\",\n" +
               "      \"time\":\"19:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"6339 Glenwood Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27612\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.856934\",\n" +
               "      \"longitude\":\"-78.706473\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Providence Baptist Church\",\n" +
               "      \"location_notes\":\"Glenwood Ave/Pleasant Valley Road\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Hills Group\",\n" +
               "      \"slug\":\"202\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=202\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4523 Six Forks Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841804\",\n" +
               "      \"longitude\":\"-78.644\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Timothy`s Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Light Group\",\n" +
               "      \"slug\":\"203\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=203\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"LGBTQ\"\n" +
               "      ],\n" +
               "      \"address\":\"1801 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.785121\",\n" +
               "      \"longitude\":\"-78.660926\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Pullen Memorial Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"St. Ambrose Group\",\n" +
               "      \"slug\":\"205\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=205\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"813 Darby Dr\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.756521\",\n" +
               "      \"longitude\":\"-78.625036\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Ambrose Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Unity Group\",\n" +
               "      \"slug\":\"206\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=206\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4301 Louisburg Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.843074\",\n" +
               "      \"longitude\":\"-78.57474\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"New Hope Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"North Raleigh Group\",\n" +
               "      \"slug\":\"209\",\n" +
               "      \"notes\":\"Open Meditation Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=209\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"10301 Old Creedmoor Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.932303\",\n" +
               "      \"longitude\":\"-78.692939\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Soapstone Chapel\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Log Cabin Group\",\n" +
               "      \"slug\":\"210\",\n" +
               "      \"notes\":\"Closed Big Book Study\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=210\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"200 High Meadow Dr\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7618971474579\",\n" +
               "      \"longitude\":\"-78.7848579884\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Kirks of Kildare Presbyterian Auxillary Bldg\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Living Now\",\n" +
               "      \"slug\":\"211\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=211\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Log Cabin Group\",\n" +
               "      \"slug\":\"213\",\n" +
               "      \"notes\":\"Closed Big Book / Step Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=213\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"200 High Meadow Dr\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7618971474579\",\n" +
               "      \"longitude\":\"-78.7848579884\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Kirks of Kildare Presbyterian Auxillary Bldg\",\n" +
               "      \"location_notes\":\"\"\n" +
                 "   },\n" +
                 "   {\n" +
               "      \"name\":\"On Awakening\",\n" +
               "      \"slug\":\"534\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=534\",\n" +
               "      \"time\":\"06:15:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
                       "   },\n";

       String json5 =  "{\n" +
               "      \"name\":\"On Awakening\",\n" +
               "      \"slug\":\"535\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=535\",\n" +
               "      \"time\":\"06:15:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wake Forest Group\",\n" +
               "      \"slug\":\"215\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=215\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"One Noon at a Time Group\",\n" +
               "      \"slug\":\"217\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=217\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"4216 Kildaire Farm Rd\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.6858144043428\",\n" +
               "      \"longitude\":\"-78.7973195314\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Community Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"One Noon at a Time Group\",\n" +
               "      \"slug\":\"218\",\n" +
               "      \"notes\":\"Closed Step / Tradition Study\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=218\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"4216 Kildaire Farm Rd\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.6858144043428\",\n" +
               "      \"longitude\":\"-78.7973195314\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Community Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"One Noon at a Time Group\",\n" +
               "      \"slug\":\"219\",\n" +
               "      \"notes\":\"Closed Literature meetings, except the Second and Last Friday of each month, which are Open Speaker meetings.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=219\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"GR\"\n" +
               "      ],\n" +
               "      \"address\":\"4216 Kildaire Farm Rd\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.6858144043428\",\n" +
               "      \"longitude\":\"-78.7973195314\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Community Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Discovery Group\",\n" +
               "      \"slug\":\"223\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=223\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"2501 Clark Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.789458\",\n" +
               "      \"longitude\":\"-78.667673\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Fairmont United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Twelve & Twelve Group\",\n" +
               "      \"slug\":\"229\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=229\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4921 Six Forks Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.848868\",\n" +
               "      \"longitude\":\"-78.645003\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hudson Memorial Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Sunday Morning Spiritual Meeting\",\n" +
               "      \"slug\":\"230\",\n" +
               "      \"notes\":\"Sunday Morning Spiritual Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=230\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"230 US Hwy 70 W \",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.701551\",\n" +
               "      \"longitude\":\"-78.5998\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Garner Women`s Club\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"New Inner City Group\",\n" +
               "      \"slug\":\"231\",\n" +
               "      \"notes\":\"Last Thursday Open Speaker\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=231\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"718 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.781156\",\n" +
               "      \"longitude\":\"-78.649987\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hillyer Memorial\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wednesday Womens Group\",\n" +
               "      \"slug\":\"232\",\n" +
               "      \"notes\":\"ENTER BUILDING THROUGH LEFT SIDE DOOR WHEN FACING CHURCH.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=232\",\n" +
               "      \"time\":\"17:45:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"W\"\n" +
               "      ],\n" +
               "      \"address\":\"2501 Clark Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.789458\",\n" +
               "      \"longitude\":\"-78.667673\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Fairmont United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Back to Basics\",\n" +
               "      \"slug\":\"233\",\n" +
               "      \"notes\":\"Beginners Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=233\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"4801 Six Forks Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.845095\",\n" +
               "      \"longitude\":\"-78.644804\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Mark`s United Methodist Church\",\n" +
               "      \"location_notes\":\"turn off Six Forks onto Northbrook Dr. (by the Daycare center), then immediately right onto Terry Street for easy parking\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Principles Group\",\n" +
               "      \"slug\":\"235\",\n" +
               "      \"notes\":\"<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=235\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1725 North New Hope Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804149\",\n" +
               "      \"longitude\":\"-78.56522\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Mark`s Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"TGIF\",\n" +
               "      \"slug\":\"236\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=236\",\n" +
               "      \"time\":\"11:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Lambda Group\",\n" +
               "      \"slug\":\"237\",\n" +
               "      \"notes\":\"Closed Gay Men`s Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=237\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"M\",\n" +
               "         \"LGBTQ\"\n" +
               "      ],\n" +
               "      \"address\":\"301 East Whitaker Mill Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8078773435826\",\n" +
               "      \"longitude\":\"-78.6376905441\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Westminister Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"\",\n" +
               "      \"slug\":\"239\",\n" +
               "      \"notes\":\"Women`s Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=239\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"\",\n" +
               "      \"slug\":\"240\",\n" +
               "      \"notes\":\"Women`s Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=240\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"\",\n" +
               "      \"slug\":\"241\",\n" +
               "      \"notes\":\"Women`s Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=241\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Sobriety at School\",\n" +
               "      \"slug\":\"242\",\n" +
               "      \"notes\":\"Close Discussion Grapevine Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=242\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"2212 Gardner Hall\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"0\",\n" +
               "      \"longitude\":\"0\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Gardner Hall, NCSU\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Last Call\",\n" +
               "      \"slug\":\"243\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=243\",\n" +
               "      \"time\":\"22:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Acceptance Group\",\n" +
               "      \"slug\":\"246\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=246\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"520 W Holding Ave\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.97426\",\n" +
               "      \"longitude\":\"-78.525082\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Catherine of Siena Parish\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Garner Big Book Group\",\n" +
               "      \"slug\":\"247\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=247\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4926 Fayetteville Rd\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.713206\",\n" +
               "      \"longitude\":\"-78.657993\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ernest Myatt Presbyterian Church\",\n" +
               "      \"location_notes\":\"Meeting in Fellowship hall\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Design For Living\",\n" +
               "      \"slug\":\"248\",\n" +
               "      \"notes\":\"Beginners Meeting<br><br><br />Speaker 1st and last Wednesday<br><br />Discussion 2nd and 3rd Wednesday\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=248\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"201 Methodist Dr\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7101409101237\",\n" +
               "      \"longitude\":\"-78.6203634739\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Garner United Methodist Church\",\n" +
               "      \"location_notes\":\"at Hwy 70\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Holly Springs Group\",\n" +
               "      \"slug\":\"249\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=249\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4216 Kildaire Farm Rd\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.6858144043428\",\n" +
               "      \"longitude\":\"-78.7973195314\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Community Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"250\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=250\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Westminster Group\",\n" +
               "      \"slug\":\"251\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=251\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"301 East Whitaker Mill Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8078773435826\",\n" +
               "      \"longitude\":\"-78.6376905441\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Westminister Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Healing Hour\",\n" +
               "      \"slug\":\"253\",\n" +
               "      \"notes\":\"Open Discussion open to Men and Women\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=253\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Healing Hour\",\n" +
               "      \"slug\":\"254\",\n" +
               "      \"notes\":\"Open Discussion open to Men and Women\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=254\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Healing Hour\",\n" +
               "      \"slug\":\"255\",\n" +
               "      \"notes\":\"Open Discussion open to Men and Women\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=255\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Healing Hour\",\n" +
               "      \"slug\":\"256\",\n" +
               "      \"notes\":\"Open Discussion open to Men and Women\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=256\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Healing Hour\",\n" +
               "      \"slug\":\"257\",\n" +
               "      \"notes\":\"Open Discussion open to Men and Women\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=257\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Healing Hour\",\n" +
               "      \"slug\":\"258\",\n" +
               "      \"notes\":\"Open Discussion open to Men and Women\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=258\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Healing Hour\",\n" +
               "      \"slug\":\"259\",\n" +
               "      \"notes\":\"Open Discussion open to Men and Women\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=259\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Holly Springs Group\",\n" +
               "      \"slug\":\"262\",\n" +
               "      \"notes\":\"Beginner`s Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=262\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"4216 Kildaire Farm Rd\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.6858144043428\",\n" +
               "      \"longitude\":\"-78.7973195314\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Community Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"North Raleigh Big Book Study Group\",\n" +
               "      \"slug\":\"268\",\n" +
               "      \"notes\":\"<br /><br />LAST THURSDAY OF THE MONTH IS OPEN DISCUSSION\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=268\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"5801 Falls of Neuse Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.859061\",\n" +
               "      \"longitude\":\"-78.618202\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Raphael Catholic Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n";

       String json6 =  "{\n" +
               "      \"name\":\"What Now?\",\n" +
               "      \"slug\":\"269\",\n" +
               "      \"notes\":\"Step 11 Discussion<BR><BR><br /><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=269\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"814 Dixie Trail\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800829\",\n" +
               "      \"longitude\":\"-78.676452\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Community United Church of Christ\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"What Now?\",\n" +
               "      \"slug\":\"270\",\n" +
               "      \"notes\":\"Step 11 Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=270\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"814 Dixie Trail\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800829\",\n" +
               "      \"longitude\":\"-78.676452\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Community United Church of Christ\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"What Now?\",\n" +
               "      \"slug\":\"271\",\n" +
               "      \"notes\":\"Step 11 Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=271\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"814 Dixie Trail\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800829\",\n" +
               "      \"longitude\":\"-78.676452\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Community United Church of Christ\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"What Now?\",\n" +
               "      \"slug\":\"272\",\n" +
               "      \"notes\":\"Step 11 Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=272\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"814 Dixie Trail\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800829\",\n" +
               "      \"longitude\":\"-78.676452\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Community United Church of Christ\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"What Now?\",\n" +
               "      \"slug\":\"273\",\n" +
               "      \"notes\":\"Step 11 Discussion<BR><BR><br /><br />NOTE NEW LOCATION EFFECTIVE MAY 21, 2012!<BR><BR>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=273\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"814 Dixie Trail\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800829\",\n" +
               "      \"longitude\":\"-78.676452\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Community United Church of Christ\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"What Now?\",\n" +
               "      \"slug\":\"274\",\n" +
               "      \"notes\":\"Step 11 Discussion <BR><BR><br /><br />NOTE NEW LOCATION EFFECTIVE MAY 21, 2012!<BR><BR>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=274\",\n" +
               "      \"time\":\"06:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"814 Dixie Trail\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800829\",\n" +
               "      \"longitude\":\"-78.676452\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Community United Church of Christ\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"No Reservations\",\n" +
               "      \"slug\":\"275\",\n" +
               "      \"notes\":\"Last Tuesday of the month is an OPEN Speaker Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=275\",\n" +
               "      \"time\":\"18:45:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"6175 Old Jenks Road\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.75451\",\n" +
               "      \"longitude\":\"-78.852448\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hope Chapel\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Upper Room\",\n" +
               "      \"slug\":\"276\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=276\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"211 E Six Forks Rd, Suite 117\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.772096\",\n" +
               "      \"longitude\":\"-78.6386145\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"211 E Six Forks Rd\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Last Call\",\n" +
               "      \"slug\":\"277\",\n" +
               "      \"notes\":\"Open Beginners Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=277\",\n" +
               "      \"time\":\"22:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Last Call\",\n" +
               "      \"slug\":\"503\",\n" +
               "      \"notes\":\"<br> Eleventh Step Candlelight Discussion <br><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=503\",\n" +
               "      \"time\":\"22:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Gateway Group\",\n" +
               "      \"slug\":\"280\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=280\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"6767 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7881499362616\",\n" +
               "      \"longitude\":\"-78.7458854914\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Ephesus Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Life of New Beginnings\",\n" +
               "      \"slug\":\"281\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=281\",\n" +
               "      \"time\":\"07:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Unity Group\",\n" +
               "      \"slug\":\"283\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=283\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"4301 Louisburg Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.843074\",\n" +
               "      \"longitude\":\"-78.57474\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"New Hope Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wake Forest Nooners\",\n" +
               "      \"slug\":\"284\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=284\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wake Forest Nooners\",\n" +
               "      \"slug\":\"285\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=285\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Saturday Night Live\",\n" +
               "      \"slug\":\"286\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=286\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"7304 Falls of the Neuse Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.884552\",\n" +
               "      \"longitude\":\"-78.625865\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Phillip Lutheran Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Sisters of Sobriety\",\n" +
               "      \"slug\":\"287\",\n" +
               "      \"notes\":\"NOTE MEETING LOCATION CHANGE AS OF JANUARY 2012\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=287\",\n" +
               "      \"time\":\"16:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"111 Lee Ct\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.638621\",\n" +
               "      \"longitude\":\"-78.475905\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Grace Episcopal\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Fuquay-Varina Group\",\n" +
               "      \"slug\":\"291\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=291\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"401 S Main St\",\n" +
               "      \"city\":\"Fuquay-Varina\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27526\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.580306\",\n" +
               "      \"longitude\":\"-78.799772\",\n" +
               "      \"region\":\"Fuquay-Varina\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Fellowship Bible Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Greenwood Forest Group\",\n" +
               "      \"slug\":\"306\",\n" +
               "      \"notes\":\"BEGINNING SEPTEMBER 2012 THIS IS A BIG BOOK STUDY.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=306\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"\",\n" +
               "      \"slug\":\"295\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=295\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"527 Plaza Circle\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.70439\",\n" +
               "      \"longitude\":\"-78.611624\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Sovereign King Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Experience Strength And Hope\",\n" +
               "      \"slug\":\"296\",\n" +
               "      \"notes\":\"First Sunday each month is an open speaker meeting.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=296\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"9713 Old Stage Rd\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.641961\",\n" +
               "      \"longitude\":\"-78.669953\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Let Go and Let God\",\n" +
               "      \"slug\":\"303\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=303\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1308 Hwy 70 West\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7112642\",\n" +
               "      \"longitude\":\"-78.6141709\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Capital Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Womens Steps to Serenity\",\n" +
               "      \"slug\":\"305\",\n" +
               "      \"notes\":\"<br /><br /> \",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=305\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"W\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"600 Walnut St\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.774459\",\n" +
               "      \"longitude\":\"-78.76788\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Christ the King Lutheran Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Prodigious Results Big Book Study\",\n" +
               "      \"slug\":\"528\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=528\",\n" +
               "      \"time\":\"18:45:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"136 East Morgan Street\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27601\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.779331\",\n" +
               "      \"longitude\":\"-78.636812\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Church on Morgan\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Daily Reprieve\",\n" +
               "      \"slug\":\"312\",\n" +
               "      \"notes\":\"* Where: LaVerna Center (log cabin)<br><br />Enter through basement door. *\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=312\",\n" +
               "      \"time\":\"07:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"LIT\"\n" +
               "      ],\n" +
               "      \"address\":\"11501 Leesville Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.918871\",\n" +
               "      \"longitude\":\"-78.738355\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Francis of Assisi Catholic Church\",\n" +
               "      \"location_notes\":\"**no smoking on church premises before, during or after the meeting**\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Daily Reprieve\",\n" +
               "      \"slug\":\"313\",\n" +
               "      \"notes\":\"Meditation and Discussion<br /><BR><BR><br /><br />* Where: LaVerna Center (log cabin)<br><br />Enter through basement door. *\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=313\",\n" +
               "      \"time\":\"07:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"LIT\"\n" +
               "      ],\n" +
               "      \"address\":\"11501 Leesville Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.918871\",\n" +
               "      \"longitude\":\"-78.738355\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Francis of Assisi Catholic Church\",\n" +
               "      \"location_notes\":\"**no smoking on church premises before, during or after the meeting**\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Acceptance Group\",\n" +
               "      \"slug\":\"314\",\n" +
               "      \"notes\":\"<BR><br />Open Speaker/Discussion<br><br><br />Last wednesday of the month is `Chair Person`s Choice.`\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=314\",\n" +
               "      \"time\":\"19:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"520 W Holding Ave\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.97426\",\n" +
               "      \"longitude\":\"-78.525082\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Catherine of Siena Parish\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"A New Freedom\",\n" +
               "      \"slug\":\"489\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=489\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"1308 Hwy 70 West\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7112642\",\n" +
               "      \"longitude\":\"-78.6141709\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Capital Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Agnostics and Others\",\n" +
               "      \"slug\":\"514\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=514\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"3313 Wade Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800538\",\n" +
               "      \"longitude\":\"-78.67978\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Unitarian Universalist Fellowship of Raleigh\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Women`s Step Meeting\",\n" +
               "      \"slug\":\"320\",\n" +
               "      \"notes\":\"Last Tuesday of the month is a Tradition meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=320\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\",\n" +
               "         \"W\"\n" +
               "      ],\n" +
               "      \"address\":\"7509 Leadmine Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.8843214868599\",\n" +
               "      \"longitude\":\"-78.6607146263\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Greystone Baptist Church\",\n" +
               "      \"location_notes\":\"Corner of Leadmine and Sawmill Rd\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Keep It Simple Group\",\n" +
               "      \"slug\":\"321\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=321\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Holly Springs Group\",\n" +
               "      \"slug\":\"323\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=323\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4216 Kildaire Farm Rd\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.6858144043428\",\n" +
               "      \"longitude\":\"-78.7973195314\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Community Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Turning Point Group\",\n" +
               "      \"slug\":\"328\",\n" +
               "      \"notes\":\"Open Beginner/Literature meeting<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=328\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"3000 New Bern Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.785256\",\n" +
               "      \"longitude\":\"-78.588339\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Medical Center\",\n" +
               "      \"location_notes\":\"Temporary Location: C Tower, 6th Floor Conference Room - until 1/31/17<br /><br><br><br />5th Floor conference room C tower\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"West Cary Noon\",\n" +
               "      \"slug\":\"329\",\n" +
               "      \"notes\":\"Handicap access / No Smoking<BR><br />Meeting is in Room 206<br /><BR><br />Follow signs to Fellowship Hall\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=329\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"200 West High St\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27513\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.767731\",\n" +
               "      \"longitude\":\"-78.831937\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Westwood Baptist Church\",\n" +
               "      \"location_notes\":\"No Smoking on church campus\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Epiphany Group\",\n" +
               "      \"slug\":\"334\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=334\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1800 Glenwood Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804447\",\n" +
               "      \"longitude\":\"-78.645638\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hayes Barton Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Epiphany Group\",\n" +
               "      \"slug\":\"335\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=335\",\n" +
               "      \"time\":\"12:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1800 Glenwood Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804447\",\n" +
               "      \"longitude\":\"-78.645638\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hayes Barton Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"North Raleigh Group\",\n" +
               "      \"slug\":\"337\",\n" +
               "      \"notes\":\"Beginner`s Meeting - Living Sober Book Study\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=337\",\n" +
               "      \"time\":\"08:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"GR\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"10301 Old Creedmoor Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.932303\",\n" +
               "      \"longitude\":\"-78.692939\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Soapstone Chapel\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Together We Live\",\n" +
               "      \"slug\":\"543\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=543\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"407 East End Ave\",\n" +
               "      \"city\":\"Littleton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27850\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.438425\",\n" +
               "      \"longitude\":\"-77.900128\",\n" +
               "      \"region\":\"Littleton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Johns center\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Hope of Fuquay\",\n" +
               "      \"slug\":\"341\",\n" +
               "      \"notes\":\"Spiritual\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=341\",\n" +
               "      \"time\":\"08:15:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"6400 Johnson Pond Rd\",\n" +
               "      \"city\":\"Fuquay-Varina\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27526\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.60986\",\n" +
               "      \"longitude\":\"-78.75672\",\n" +
               "      \"region\":\"Fuquay-Varina\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"American Legion Lodge # 116\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Chapter 7 Group (Western Wake Med Center)\",\n" +
               "      \"slug\":\"343\",\n" +
               "      \"notes\":\"Open Beginners/Literature meeting.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=343\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"1900 Kildaire Farm Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27518\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.740182\",\n" +
               "      \"longitude\":\"-78.781544\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cary Wake Medical Center\",\n" +
               "      \"location_notes\":\"The meeting is held in the Points West Conference Room #2 in the Points West Cafeteria.<br />\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"344\",\n" +
               "      \"notes\":\"Beginners Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=344\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"345\",\n" +
               "      \"notes\":\"Meditation Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=345\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"There Is A Solution\",\n" +
               "      \"slug\":\"346\",\n" +
               "      \"notes\":\"<br><br><br /><br /><br />1st Thursday - Open Speaker <br><br /><br><br />2nd Thursday - Closed Step Study <br><br /><br><br />3rd Thursday - Closed Literature Study <br><br /><br><br />4th Thursday - Closed Tradition Study <br><br /><br><br />5th Thursday - Open Workshop <br><br /><br><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=346\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"108 Avent Ferry Rd\",\n" +
               "      \"city\":\"Holly Springs\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27540\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.650911\",\n" +
               "      \"longitude\":\"-78.835054\",\n" +
               "      \"region\":\"Holly Springs\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Holly Springs United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Turning Point Group\",\n" +
               "      \"slug\":\"348\",\n" +
               "      \"notes\":\"Open Beginner Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=348\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"3000 New Bern Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.785256\",\n" +
               "      \"longitude\":\"-78.588339\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Medical Center\",\n" +
               "      \"location_notes\":\"Temporary Location: C Tower, 6th Floor Conference Room - until 1/31/17<br /><br><br><br />5th Floor conference room C tower\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"11th Step at 11 Group\",\n" +
               "      \"slug\":\"349\",\n" +
               "      \"notes\":\"Topic will always be the 11th Step and includes periods of silent meditation.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=349\",\n" +
               "      \"time\":\"11:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7641693659824\",\n" +
               "      \"longitude\":\"-78.6586976051\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County\",\n" +
               "      \"location_notes\":\"Off Lake Wheeler Rd. near Farmer`s Market\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Volver a Empezar\",\n" +
               "      \"slug\":\"355\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=355\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4427 St. James Church Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841038\",\n" +
               "      \"longitude\":\"-78.574715\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"SPANISH - Volver a Empezar Meets Here\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Volver a Empezar\",\n" +
               "      \"slug\":\"357\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=357\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4427 St. James Church Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841038\",\n" +
               "      \"longitude\":\"-78.574715\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"SPANISH - Volver a Empezar Meets Here\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Pickles in the Park Meeting\",\n" +
               "      \"slug\":\"352\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=352\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1800 N Harrison Ave\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27513\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.833315\",\n" +
               "      \"longitude\":\"-78.760441\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Umstead Park - Reedy Creek Entrance\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Volver a Empezar\",\n" +
               "      \"slug\":\"353\",\n" +
               "      \"notes\":\"Meets 8:00pm until 10:00pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=353\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4427 St. James Church Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841038\",\n" +
               "      \"longitude\":\"-78.574715\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"SPANISH - Volver a Empezar Meets Here\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Volver a Empezar\",\n" +
               "      \"slug\":\"354\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=354\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4427 St. James Church Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841038\",\n" +
               "      \"longitude\":\"-78.574715\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"SPANISH - Volver a Empezar Meets Here\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Volver a Empezar\",\n" +
               "      \"slug\":\"358\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=358\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4427 St. James Church Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841038\",\n" +
               "      \"longitude\":\"-78.574715\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"SPANISH - Volver a Empezar Meets Here\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Volver a Empezar\",\n" +
               "      \"slug\":\"359\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=359\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4427 St. James Church Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841038\",\n" +
               "      \"longitude\":\"-78.574715\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"SPANISH - Volver a Empezar Meets Here\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Volver a Empezar\",\n" +
               "      \"slug\":\"360\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=360\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"4427 St. James Church Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27604\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841038\",\n" +
               "      \"longitude\":\"-78.574715\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"SPANISH - Volver a Empezar Meets Here\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Transmitelo\",\n" +
               "      \"slug\":\"361\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=361\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1615 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804745\",\n" +
               "      \"longitude\":\"-78.65773\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St John`s Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Transmitelo\",\n" +
               "      \"slug\":\"362\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=362\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1615 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804745\",\n" +
               "      \"longitude\":\"-78.65773\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St John`s Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Transmitelo\",\n" +
               "      \"slug\":\"363\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=363\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1615 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804745\",\n" +
               "      \"longitude\":\"-78.65773\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St John`s Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Transmitelo\",\n" +
               "      \"slug\":\"364\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=364\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1615 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804745\",\n" +
               "      \"longitude\":\"-78.65773\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St John`s Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Transmitelo\",\n" +
               "      \"slug\":\"365\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=365\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1615 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804745\",\n" +
               "      \"longitude\":\"-78.65773\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St John`s Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Transmitelo\",\n" +
               "      \"slug\":\"366\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=366\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1615 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804745\",\n" +
               "      \"longitude\":\"-78.65773\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St John`s Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Transmitelo\",\n" +
               "      \"slug\":\"367\",\n" +
               "      \"notes\":\"Meets 8:00 pm - 10:00 pm\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=367\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1615 Oberlin Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804745\",\n" +
               "      \"longitude\":\"-78.65773\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St John`s Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Divina Providencia\",\n" +
               "      \"slug\":\"375\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=375\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"608 Lions Club Rd\",\n" +
               "      \"city\":\"Wendell\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27591\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.780987\",\n" +
               "      \"longitude\":\"-78.3697213\",\n" +
               "      \"region\":\"Wendell\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Eugene`s Catholic Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Let Go and Let God\",\n" +
               "      \"slug\":\"379\",\n" +
               "      \"notes\":\"Women`s Big Book / Step Study<br>Men`s Big Book / Step Study<br>(Separate Meetings)\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=379\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\",\n" +
               "         \"M\",\n" +
               "         \"W\"\n" +
               "      ],\n" +
               "      \"address\":\"1308 Hwy 70 West\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7112642\",\n" +
               "      \"longitude\":\"-78.6141709\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Capital Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Rule #62 Group\",\n" +
               "      \"slug\":\"380\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=380\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"602 East Mason St\",\n" +
               "      \"city\":\"Franklinton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27525\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.105791\",\n" +
               "      \"longitude\":\"-78.44822\",\n" +
               "      \"region\":\"Franklinton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Franklinton Senior Center\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"One Chapter at a Time\",\n" +
               "      \"slug\":\"385\",\n" +
               "      \"notes\":\"WE WILL READ A WHOLE CHAPTER EACH WEEK WHICH WILL ENABLE US TO GO THROUGH THE FIRST 164 PAGES FOUR TIMES A YEAR.<br /><br><br /><br><br />BYOB (Bring your own Book)\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=385\",\n" +
               "      \"time\":\"08:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"820 East Williams St\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27502\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.72278\",\n" +
               "      \"longitude\":\"-78.845407\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"New Horizons Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Arch to Freedom Group\",\n" +
               "      \"slug\":\"383\",\n" +
               "      \"notes\":\"<br><br /><br />Twelve & Twelve Study<br /><br /><br><br><br /><br />Business Meeting: Third Monday after regular meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=383\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"100 S Hughes St\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27502\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.729291\",\n" +
               "      \"longitude\":\"-78.850053\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Apex United Methodist Church - Fellowship Hall #2\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"We Are Not All There Group\",\n" +
               "      \"slug\":\"491\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=491\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"896 Gulley Drive\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.665997\",\n" +
               "      \"longitude\":\"-78.497455\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"We Are Not All There Group\",\n" +
               "      \"slug\":\"493\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=493\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"896 Gulley Drive\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.665997\",\n" +
               "      \"longitude\":\"-78.497455\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"We Are Not All There Group\",\n" +
               "      \"slug\":\"494\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=494\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"896 Gulley Drive\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.665997\",\n" +
               "      \"longitude\":\"-78.497455\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n";

       String json7 =  "{\n" +
               "      \"name\":\"We Are Not All There Group\",\n" +
               "      \"slug\":\"495\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=495\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"896 Gulley Drive\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.665997\",\n" +
               "      \"longitude\":\"-78.497455\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Be Still ... Mid-Morning Meditation Group\",\n" +
               "      \"slug\":\"386\",\n" +
               "      \"notes\":\"<BR><br />11th Step Meeting with 15 minute meditation after a reading.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=386\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Daily Reprieve\",\n" +
               "      \"slug\":\"469\",\n" +
               "      \"notes\":\"Meditation and Discussion.<br /><br><br />* Where: LaVerna Center (log cabin)<br><br />Enter through basement door. *\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=469\",\n" +
               "      \"time\":\"07:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"LIT\"\n" +
               "      ],\n" +
               "      \"address\":\"11501 Leesville Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.918871\",\n" +
               "      \"longitude\":\"-78.738355\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Francis of Assisi Catholic Church\",\n" +
               "      \"location_notes\":\"**no smoking on church premises before, during or after the meeting**\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Be Still ... Mid-Morning Meditation Group\",\n" +
               "      \"slug\":\"387\",\n" +
               "      \"notes\":\"<br />11th Step Meeting with 15 minutes of meditation after a reading.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=387\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Be Still ... Mid-Morning Meditation Group\",\n" +
               "      \"slug\":\"388\",\n" +
               "      \"notes\":\"<br /><br />11th Step Meeting with 15 minutes of meditation after a reading.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=388\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Be Still ... Mid-Morning Meditation Group\",\n" +
               "      \"slug\":\"389\",\n" +
               "      \"notes\":\"<br />11th Step Meeting with 15 minutes of meditation after a reading.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=389\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Be Still ... Mid-Morning Meditation Group\",\n" +
               "      \"slug\":\"390\",\n" +
               "      \"notes\":\"<br />11th Step Meeting with 15 minutes of meditation after a reading.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=390\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Be Still ... Mid-Morning Meditation Group\",\n" +
               "      \"slug\":\"468\",\n" +
               "      \"notes\":\"<br />11th Step Meeting with 15 minutes of meditation after a reading.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=468\",\n" +
               "      \"time\":\"11:30:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"BY THE BOOK\",\n" +
               "      \"slug\":\"394\",\n" +
               "      \"notes\":\"<br><br />Plentiful parking available. <br><br /><br />Please use the church parking lot off of Whittaker Mill Road. Park in the rear of the lot and enter through the back door. The meeting is on the second floor, at the end of the hall.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=394\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"1800 Glenwood Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804447\",\n" +
               "      \"longitude\":\"-78.645638\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hayes Barton Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"YRAC Big Book\",\n" +
               "      \"slug\":\"391\",\n" +
               "      \"notes\":\"Open Big Book Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=391\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"YRAC Big Book\",\n" +
               "      \"slug\":\"392\",\n" +
               "      \"notes\":\"Closed Literature Study.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=392\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Spiritual Awakenings\",\n" +
               "      \"slug\":\"401\",\n" +
               "      \"notes\":\"<br /><br /><B>NOTE: THIS GROUP MEETS ONLY ON THE THIRD SATURDAY OF EACH MONTH</B><br />                         <BR> <BR><br />3 MEETINGS EVERY THIRD SATURDAY<br /><BR><br />  8:00 AM: GOD AS WE UNDERSTAND HIM<BR><br />  9:15 AM: SPIRITUAL RECOVERY PRINCIPLES OF THE BEATITUDES<BR><br />10:30 AM : SPIRITUAL AWAKENINGS<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=401\",\n" +
               "      \"time\":\"08:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4801 Six Forks Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.845095\",\n" +
               "      \"longitude\":\"-78.644804\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Mark`s United Methodist Church\",\n" +
               "      \"location_notes\":\"turn off Six Forks onto Northbrook Dr. (by the Daycare center), then immediately right onto Terry Street for easy parking\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Cary Young People`s Group\",\n" +
               "      \"slug\":\"403\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=403\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Primary Purpose Group of Clayton\",\n" +
               "      \"slug\":\"402\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=402\",\n" +
               "      \"time\":\"08:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"896 Gulley Drive\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.665997\",\n" +
               "      \"longitude\":\"-78.497455\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Courage to Change Group\",\n" +
               "      \"slug\":\"440\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=440\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1401 Boyer St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27610\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.781259\",\n" +
               "      \"longitude\":\"-78.617372\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Grace AME Zion Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Basics for Beginners\",\n" +
               "      \"slug\":\"441\",\n" +
               "      \"notes\":\"BEGINNERS MEETING<br><br />Focus on Steps 1, 2 & 3 and Sponsorship<br /><br><br />Note: Entry from Lakeside Drive ONLY\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=441\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1101 Vandora Springs Rd\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.703503\",\n" +
               "      \"longitude\":\"-78.626632\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St. Christopher`s Episcopal Church \",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Spring Forest Recovery Group\",\n" +
               "      \"slug\":\"404\",\n" +
               "      \"notes\":\"1st,  3rd & 5th Sundays - Speaker Meeting<br /><br />2nd & 4th Sundays - Big Book Study\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=404\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"D\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Spring Forest Recovery Group\",\n" +
               "      \"slug\":\"405\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=405\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"445\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=445\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Channel of Serenity\",\n" +
               "      \"slug\":\"412\",\n" +
               "      \"notes\":\"Meeting is located on the 2nd floor. There is no handicapped access.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=412\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"8701 Falls of Neuse Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.896436\",\n" +
               "      \"longitude\":\"-78.612741\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"North Raleigh Church of Christ\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"There Is A Solution\",\n" +
               "      \"slug\":\"406\",\n" +
               "      \"notes\":\"BEGINNER`S MEETING\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=406\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"BE\"\n" +
               "      ],\n" +
               "      \"address\":\"108 Avent Ferry Rd\",\n" +
               "      \"city\":\"Holly Springs\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27540\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.650911\",\n" +
               "      \"longitude\":\"-78.835054\",\n" +
               "      \"region\":\"Holly Springs\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Holly Springs United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"We Agnostics\",\n" +
               "      \"slug\":\"413\",\n" +
               "      \"notes\":\"Room 347 <br> <br><br />Open Big Book/ 12&12 Study<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=413\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"3948 Browning Place - Room 347\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.830798\",\n" +
               "      \"longitude\":\"-78.631019\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Intergroup Office\",\n" +
               "      \"location_notes\":\"The Tri-County Intergroup Office of Alcoholics Anonymous\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Original Recipe Big Book Step Study\",\n" +
               "      \"slug\":\"415\",\n" +
               "      \"notes\":\"Meeting is 6:30 pm - 8:00 pm <br><br><br /><br />Special Directions: At the entrance closest to the Kildaire Farms Rd<br />side there is an area with Picnic tables, the door to our meeting is<br />at the end of that patio. <br><br><br />(We have a small sign with our our AA BBSS displayed on the Door)<br /><br><BR><br />Bring Your Own Book!<br /><br /><br><br><br />Business Meeting is the last Tuesday of the Month. <br><br />Contact ID:Chuck1152@hotmail.com<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=415\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"110 SE Maynard Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.770437\",\n" +
               "      \"longitude\":\"-78.780783\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Greenwood Forest Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"By God`s Grace\",\n" +
               "      \"slug\":\"416\",\n" +
               "      \"notes\":\"Open Discussion <br><br />1st & 3rd Thursday Big Book Step Study\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=416\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"608 Lions Club Rd\",\n" +
               "      \"city\":\"Wendell\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27591\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.780987\",\n" +
               "      \"longitude\":\"-78.3697213\",\n" +
               "      \"region\":\"Wendell\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Eugene`s Catholic Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"446\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=446\",\n" +
               "      \"time\":\"17:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Road to Recovery\",\n" +
               "      \"slug\":\"418\",\n" +
               "      \"notes\":\"Enter Left Side of Church.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=418\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"9433 Ten-Ten Rd\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.653012\",\n" +
               "      \"longitude\":\"-78.660163\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Holland`s United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"11th Step Prayer and Meditation Meeting\",\n" +
               "      \"slug\":\"425\",\n" +
               "      \"notes\":\"PLEASE COME EARLY, DOORS LOCK AT 8:30 AM.<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=425\",\n" +
               "      \"time\":\"08:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1800 Glenwood Ave\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27608\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.804447\",\n" +
               "      \"longitude\":\"-78.645638\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Hayes Barton Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"First 164\",\n" +
               "      \"slug\":\"483\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=483\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"1128 South Main Street\",\n" +
               "      \"city\":\"Fuquay-Varina\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"0\",\n" +
               "      \"longitude\":\"0\",\n" +
               "      \"region\":\"Fuquay-Varina\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Trinity Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Way of Life Group\",\n" +
               "      \"slug\":\"429\",\n" +
               "      \"notes\":\"<br><br />Meeting is downstairs<BR><BR><br />1st Monday of the month is a BBS<br><br />2nd Monday of the month is a workshop<br><br />3rd Monday of the month is a beginners <br><br />4th Monday of the month is a step study <br><br />5th Monday of the month is a speaker meeting <br>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=429\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"124 S Salisbury St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27601\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.77871\",\n" +
               "      \"longitude\":\"-78.640412\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"124 S Salisbury St\",\n" +
               "      \"location_notes\":\"Meeting Downstairs\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Log Cabin Group\",\n" +
               "      \"slug\":\"497\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=497\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"200 High Meadow Dr\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7618971474579\",\n" +
               "      \"longitude\":\"-78.7848579884\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Kirks of Kildare Presbyterian Auxillary Bldg\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"On Awakening\",\n" +
               "      \"slug\":\"537\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=537\",\n" +
               "      \"time\":\"06:15:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"On Awakening\",\n" +
               "      \"slug\":\"538\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=538\",\n" +
               "      \"time\":\"06:15:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Light Group\",\n" +
               "      \"slug\":\"436\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=436\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\",\n" +
               "         \"LGBTQ\"\n" +
               "      ],\n" +
               "      \"address\":\"1801 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.785121\",\n" +
               "      \"longitude\":\"-78.660926\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Pullen Memorial Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Honeycutt Road Group\",\n" +
               "      \"slug\":\"438\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=438\",\n" +
               "      \"time\":\"19:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"8501 Honeycutt Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27615\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.896775\",\n" +
               "      \"longitude\":\"-78.623494\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"North Raleigh United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"533\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=533\",\n" +
               "      \"time\":\"06:45:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Stepping Stones\",\n" +
               "      \"slug\":\"442\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=442\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"3304 Glen Royal Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27617\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.882631\",\n" +
               "      \"longitude\":\"-78.750789\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Healing Place of Wake County (Women`s)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"AAnything It Takes\",\n" +
               "      \"slug\":\"525\",\n" +
               "      \"notes\":\" <br><br>Many paths to spirituality.<br><br>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=525\",\n" +
               "      \"time\":\"08:30:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"814 Dixie Trail\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27607\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.800829\",\n" +
               "      \"longitude\":\"-78.676452\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Community United Church of Christ\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"The Steps We Took\",\n" +
               "      \"slug\":\"447\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=447\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"408 E Williams St\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27539\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.725129\",\n" +
               "      \"longitude\":\"-78.849125\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Apex Masonic Lodge\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Sharing the Promises\",\n" +
               "      \"slug\":\"466\",\n" +
               "      \"notes\":\"<br><br />Literature Discussion Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=466\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Pass It On\",\n" +
               "      \"slug\":\"485\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=485\",\n" +
               "      \"time\":\"11:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4015 Spring Forest Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27616\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.7795897\",\n" +
               "      \"longitude\":\"-78.6381787\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Camel 24 Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"A New Freedom\",\n" +
               "      \"slug\":\"451\",\n" +
               "      \"notes\":\"Meeting is child-friendly, but no child care is provided.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=451\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1308 Hwy 70 W\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.720875\",\n" +
               "      \"longitude\":\"-78.640518\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Capital Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"A New Freedom\",\n" +
               "      \"slug\":\"452\",\n" +
               "      \"notes\":\"Meeting is child-friendly, but no child care is provided.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=452\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1308 Hwy 70 W\",\n" +
               "      \"city\":\"Garner\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27529\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.720875\",\n" +
               "      \"longitude\":\"-78.640518\",\n" +
               "      \"region\":\"Garner\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Capital Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Sisters of Sobriety of Wake Forest\",\n" +
               "      \"slug\":\"453\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=453\",\n" +
               "      \"time\":\"18:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Cary Big Book Study Group\",\n" +
               "      \"slug\":\"454\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=454\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"531\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=531\",\n" +
               "      \"time\":\"06:45:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"RTP Lunch Bunch\",\n" +
               "      \"slug\":\"532\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=532\",\n" +
               "      \"time\":\"06:45:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"5117 S Miami Blvd\",\n" +
               "      \"city\":\"Durham\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27703\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.9940329\",\n" +
               "      \"longitude\":\"-78.898619\",\n" +
               "      \"region\":\"Durham\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cedar Forks Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Tuesday Women`s Meeting\",\n" +
               "      \"slug\":\"455\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=455\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"608 Lions Club Rd\",\n" +
               "      \"city\":\"Wendell\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27591\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.780987\",\n" +
               "      \"longitude\":\"-78.3697213\",\n" +
               "      \"region\":\"Wendell\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Eugene`s Catholic Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Bunners\",\n" +
               "      \"slug\":\"456\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=456\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"200 Main St\",\n" +
               "      \"city\":\"Bunn\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27508\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.962984\",\n" +
               "      \"longitude\":\"-78.255868\",\n" +
               "      \"region\":\"Bunn\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Bunn United Methodist Church, Fellowship Hall\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wake Forest Nooners\",\n" +
               "      \"slug\":\"459\",\n" +
               "      \"notes\":\"First Monday of each month is a Speaker and Discussion meeting.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=459\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wake Forest Nooners\",\n" +
               "      \"slug\":\"460\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=460\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Wake Forest Nooners\",\n" +
               "      \"slug\":\"461\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=461\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Easy Does It\",\n" +
               "      \"slug\":\"516\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=516\",\n" +
               "      \"time\":\"17:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Jumping Off Place\",\n" +
               "      \"slug\":\"465\",\n" +
               "      \"notes\":\"<br><br />Literature discussion meeting<br><br />Speaker 4th Tuesday of the month<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=465\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"4523 Six Forks Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.841804\",\n" +
               "      \"longitude\":\"-78.644\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Timothy`s Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Path to Serenity\",\n" +
               "      \"slug\":\"529\",\n" +
               "      \"notes\":\"BECAME A WOMEN`S MEETING SEPTEMBER 2016\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=529\",\n" +
               "      \"time\":\"09:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\",\n" +
               "         \"W\"\n" +
               "      ],\n" +
               "      \"address\":\"1200 North Salem Street\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27502\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.744739\",\n" +
               "      \"longitude\":\"-78.850134\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Peak United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"36 Chambers\",\n" +
               "      \"slug\":\"473\",\n" +
               "      \"notes\":\"Open Step Speaker lead followed by Discussion, Young Peoples Meeting<br><br><br />    1st/3rd Step Speaker, then Discussion <br><br />    2nd/4th Discussion with leader<br><br />    5th Friday is Chair`s Choice<br>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=473\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"1801 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.785121\",\n" +
               "      \"longitude\":\"-78.660926\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Pullen Memorial Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Soul Food Step Study\",\n" +
               "      \"slug\":\"474\",\n" +
               "      \"notes\":\"<br><br />        First Tuesday is Traditions\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=474\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"121 Hillsborough Street\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27603\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.779986\",\n" +
               "      \"longitude\":\"-78.641266\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"The Shepherds Table, Church of the Good Shepherd\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Another 24 Hours\",\n" +
               "      \"slug\":\"476\",\n" +
               "      \"notes\":\"<BR><br />New Closed Meeting of AA<br /><br><br />Originally published in 1952, Twelve Steps and<br />Twelve Traditions, the 12 and 12, is used by A.A.<br />members and groups around the world. It lays<br />out the principles by which A.A. members<br />recover and by which the fellowship functions.<br />The basic text clarifies the Steps which<br />constitute the A.A. way of life and the Traditions,<br />by which A.A. maintains its unity.<br /><br><br><br />&#8227; First Friday: Step Reading <BR><br />&#8227; Second Friday: Step Reading <BR><br />&#8227; Third Friday: Speaker about Step<BR><br />&#8227; Fourth Friday: Tradition Meeting<BR><br /><BR><BR><br />Parking: Parking is in the back or at the<br />Doubletree. <BR><BR><br />Please use the front door.<br><br />The meeting is held in the Parlor.<br /><BR><BR><br />For more info email anothertwentyfour@gmail.com\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=476\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1801 Hillsborough St\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27605\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.785121\",\n" +
               "      \"longitude\":\"-78.660926\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Pullen Memorial Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"We Are Not All There Group\",\n" +
               "      \"slug\":\"496\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=496\",\n" +
               "      \"time\":\"12:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"896 Gulley Drive\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.665997\",\n" +
               "      \"longitude\":\"-78.497455\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Bunners\",\n" +
               "      \"slug\":\"490\",\n" +
               "      \"notes\":\"<BR><br />The last Thursday of the month is a Speaker Meeting.<br><br>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=490\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\"\n" +
               "      ],\n" +
               "      \"address\":\"200 Main St\",\n" +
               "      \"city\":\"Bunn\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27508\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.962984\",\n" +
               "      \"longitude\":\"-78.255868\",\n" +
               "      \"region\":\"Bunn\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Bunn United Methodist Church, Fellowship Hall\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Cleveland 12 Step\",\n" +
               "      \"slug\":\"477\",\n" +
               "      \"notes\":\"<BR><BR><br />!!!!!!!!!!          ATTENTION          !!!!!!!!!!<BR><br /><BR><br />THIS NEW MEETING SCHEDULE BEGINS APRIL 1, 2015<BR><BR><br /><BR>1st Wednesday: Closed Step Study<BR><br />2nd Wednesday: Closed Tradition Study<BR><br />3rd Wednesday: Closed AA Literature Study<BR><br />4th Wednesday: Open Speaker Meeting<BR>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=477\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"8927 Cleveland Rd\",\n" +
               "      \"city\":\"Clayton\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27520\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.566008\",\n" +
               "      \"longitude\":\"-78.527723\",\n" +
               "      \"region\":\"Clayton\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Oakland Presbyterian Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Daily Reprieve\",\n" +
               "      \"slug\":\"479\",\n" +
               "      \"notes\":\"* Where: LaVerna Center (log cabin)<br><br />Enter through basement door. *\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=479\",\n" +
               "      \"time\":\"07:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"LIT\"\n" +
               "      ],\n" +
               "      \"address\":\"11501 Leesville Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.918871\",\n" +
               "      \"longitude\":\"-78.738355\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Francis of Assisi Catholic Church\",\n" +
               "      \"location_notes\":\"**no smoking on church premises before, during or after the meeting**\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Daily Reprieve\",\n" +
               "      \"slug\":\"480\",\n" +
               "      \"notes\":\"* Where: LaVerna Center (log cabin)<br><br />Enter through basement door. *\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=480\",\n" +
               "      \"time\":\"07:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"LIT\"\n" +
               "      ],\n" +
               "      \"address\":\"11501 Leesville Rd\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27613\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.918871\",\n" +
               "      \"longitude\":\"-78.738355\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"St Francis of Assisi Catholic Church\",\n" +
               "      \"location_notes\":\"**no smoking on church premises before, during or after the meeting**\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Last Call\",\n" +
               "      \"slug\":\"498\",\n" +
               "      \"notes\":\"<br /><BR> As Bill Sees It - Discussion<BR><br /><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=498\",\n" +
               "      \"time\":\"22:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Last Call\",\n" +
               "      \"slug\":\"499\",\n" +
               "      \"notes\":\"<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=499\",\n" +
               "      \"time\":\"22:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"B\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Last Call\",\n" +
               "      \"slug\":\"500\",\n" +
               "      \"notes\":\"<br /><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=500\",\n" +
               "      \"time\":\"22:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"SP\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Last Call\",\n" +
               "      \"slug\":\"504\",\n" +
               "      \"notes\":\"<br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=504\",\n" +
               "      \"time\":\"22:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Ladies Into Action\",\n" +
               "      \"slug\":\"511\",\n" +
               "      \"notes\":\"Women`s Meeting\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=511\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"GR\",\n" +
               "         \"W\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Victor E`s Literature Meeting\",\n" +
               "      \"slug\":\"512\",\n" +
               "      \"notes\":\"Meets each Monday, EXCEPT 2nd Monday.\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=512\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"GR\"\n" +
               "      ],\n" +
               "      \"address\":\"3948 Browning Place - Room 347\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27609\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.830798\",\n" +
               "      \"longitude\":\"-78.631019\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Intergroup Office\",\n" +
               "      \"location_notes\":\"The Tri-County Intergroup Office of Alcoholics Anonymous\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"11th Step at 11 Group\",\n" +
               "      \"slug\":\"515\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=515\",\n" +
               "      \"time\":\"20:15:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\"\n" +
               "      ],\n" +
               "      \"address\":\"1251 Goode Street\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"0\",\n" +
               "      \"longitude\":\"0\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Healing Place of Wake County - Men\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Progress Not Perfection Women`s Group\",\n" +
               "      \"slug\":\"521\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=521\",\n" +
               "      \"time\":\"15:00:00\",\n" +
               "      \"day\":\"Sunday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"W\"\n" +
               "      ],\n" +
               "      \"address\":\"905 S Main St\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.966996\",\n" +
               "      \"longitude\":\"-78.516429\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"On Awakening\",\n" +
               "      \"slug\":\"522\",\n" +
               "      \"notes\":\"Meditation, Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=522\",\n" +
               "      \"time\":\"06:00:00\",\n" +
               "      \"day\":\"Monday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"LIT\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"On Awakening\",\n" +
               "      \"slug\":\"523\",\n" +
               "      \"notes\":\"Meditation, Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=523\",\n" +
               "      \"time\":\"06:00:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"LIT\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"On Awakening\",\n" +
               "      \"slug\":\"524\",\n" +
               "      \"notes\":\"Meditation, Discussion\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=524\",\n" +
               "      \"time\":\"06:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"LIT\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"One Chapter at a Time\",\n" +
               "      \"slug\":\"526\",\n" +
               "      \"notes\":\"<br><br /> <br />Thursday night is an open literature study based on writings from As Bill Sees It.<br /><br>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=526\",\n" +
               "      \"time\":\"19:30:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\"\n" +
               "      ],\n" +
               "      \"address\":\"820 East Williams St\",\n" +
               "      \"city\":\"Apex\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27502\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.72278\",\n" +
               "      \"longitude\":\"-78.845407\",\n" +
               "      \"region\":\"Apex\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"New Horizons Fellowship\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"The Legacy Group\",\n" +
               "      \"slug\":\"527\",\n" +
               "      \"notes\":\"<br><br />1st we recover from alcoholism, <br><br />2nd we stay together in unity, <br><br />3rd our legacy is to serve its Primary Purpose of<br />carrying the message to all who need it and want it<br><br /><br /><br><br />OPEN DISCUSSION <br><br />ROTATING FORMAT<br><br><br />THIS IS A NON SMOKING MEETING INSIDE AND OUTSIDE PER<br />REQUEST FROM THE CHURCH, NO SMOKING ON PROPERY!!!<br>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=527\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"1001 Steeple Square Ct.\",\n" +
               "      \"city\":\"Knightdale\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27545\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"0\",\n" +
               "      \"longitude\":\"0\",\n" +
               "      \"region\":\"Knightdale\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Cross Point Community Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"On Awakening\",\n" +
               "      \"slug\":\"536\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=536\",\n" +
               "      \"time\":\"06:15:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"ST\"\n" +
               "      ],\n" +
               "      \"address\":\"932 South Cross Street\",\n" +
               "      \"city\":\"Youngsville\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27596\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"36.007464\",\n" +
               "      \"longitude\":\"-78.476607\",\n" +
               "      \"region\":\"Youngsville\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest Alano Club (WAC)\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Be Still ... Mid-Morning Meditation Group\",\n" +
               "      \"slug\":\"530\",\n" +
               "      \"notes\":\"\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=530\",\n" +
               "      \"time\":\"11:00:00\",\n" +
               "      \"day\":\"Saturday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"X\"\n" +
               "      ],\n" +
               "      \"address\":\"177 High House Rd\",\n" +
               "      \"city\":\"Cary\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27511\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78161\",\n" +
               "      \"longitude\":\"-78.798191\",\n" +
               "      \"region\":\"Cary\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Triangle Alano Club\",\n" +
               "      \"location_notes\":\"Please do not park right up front before noon on weekdays\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"The Love and Tolerance Group\",\n" +
               "      \"slug\":\"539\",\n" +
               "      \"notes\":\"<BR>Steps and Traditions study. <BR><br />Third Tuesday is a BEGINNERS meeting.<BR><BR>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=539\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"1498 Hodge Road\",\n" +
               "      \"city\":\"Knightdale\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78442\",\n" +
               "      \"longitude\":\"-78.527977\",\n" +
               "      \"region\":\"Knightdale\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Green Pines Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Rise Above It\",\n" +
               "      \"slug\":\"540\",\n" +
               "      \"notes\":\"<BR> 1st Tuesday - Speaker<BR><br />2nd Tuesday - Tradition<BR><br />3rd & 4th Tuesdays - Big Book<BR><br />5th Tuesday - Concepts <BR><br /><br>\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=540\",\n" +
               "      \"time\":\"19:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\"\n" +
               "      ],\n" +
               "      \"address\":\"9121 Six Forks Road\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.903672\",\n" +
               "      \"longitude\":\"-78.654546\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Windborne United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Love and Tolerance Group\",\n" +
               "      \"slug\":\"541\",\n" +
               "      \"notes\":\"<br><br />1st Tuesday — Closed Step Study <BR><br />2nd Tuesday — Closed Tradition Study<BR><br />3rd Tuesday — Open Speaker Meeting <BR><br />4th Tuesday — Open Beginner Meeting, Steps 1, 2, 3 <BR><br />If 5th Tuesday — Open Speaker Meeting or Workshop, Chairperson’s Choice <BR><BR><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=541\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Tuesday\",\n" +
               "      \"types\":[\n" +
               "         \"C\",\n" +
               "         \"B\"\n" +
               "      ],\n" +
               "      \"address\":\"1498 Hodge Road\",\n" +
               "      \"city\":\"Knightdale\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"35.78442\",\n" +
               "      \"longitude\":\"-78.527977\",\n" +
               "      \"region\":\"Knightdale\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Green Pines Baptist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"First 164\",\n" +
               "      \"slug\":\"542\",\n" +
               "      \"notes\":\"<br> <br />Last Wednesday of the Month is a Speaker Meeting.<br /><br><br><br />\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=542\",\n" +
               "      \"time\":\"18:30:00\",\n" +
               "      \"day\":\"Wednesday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\"\n" +
               "      ],\n" +
               "      \"address\":\"1128 South Main Street\",\n" +
               "      \"city\":\"Fuquay-Varina\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"0\",\n" +
               "      \"longitude\":\"0\",\n" +
               "      \"region\":\"Fuquay-Varina\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Trinity Episcopal Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"The James Club\",\n" +
               "      \"slug\":\"545\",\n" +
               "      \"notes\":\"MENS MEETING\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=545\",\n" +
               "      \"time\":\"20:00:00\",\n" +
               "      \"day\":\"Thursday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"ST\",\n" +
               "         \"M\"\n" +
               "      ],\n" +
               "      \"address\":\"300 Powell Street\",\n" +
               "      \"city\":\"Raleigh\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27606\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"0\",\n" +
               "      \"longitude\":\"0\",\n" +
               "      \"region\":\"Raleigh\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Westover Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   },\n" +
               "   {\n" +
               "      \"name\":\"Recovery 101\",\n" +
               "      \"slug\":\"546\",\n" +
               "      \"notes\":\"Literature Study - Living Sober\",\n" +
               "      \"updated\":\"2017-04-28 22:46:58\",\n" +
               "      \"url\":\"http:\\/\\/m.raleighaa.com\\/additional.php?id=546\",\n" +
               "      \"time\":\"10:00:00\",\n" +
               "      \"day\":\"Friday\",\n" +
               "      \"types\":[\n" +
               "         \"O\",\n" +
               "         \"GR\"\n" +
               "      ],\n" +
               "      \"address\":\"905 South Main Street\",\n" +
               "      \"city\":\"Wake Forest\",\n" +
               "      \"state\":\"NC\",\n" +
               "      \"postal_code\":\"27587\",\n" +
               "      \"country\":\"US\",\n" +
               "      \"latitude\":\"0\",\n" +
               "      \"longitude\":\"0\",\n" +
               "      \"region\":\"Wake Forest\",\n" +
               "      \"timezone\":\"America\\/New_York\",\n" +
               "      \"location\":\"Wake Forest United Methodist Church\",\n" +
               "      \"location_notes\":\"\"\n" +
               "   }\n" +
               "]";
         String json = json1+json2+json3+json4+json5+json6+json7;

         System.out.println(json);

   }
}
