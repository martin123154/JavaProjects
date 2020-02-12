<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head lang="pl">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Projekt zespolowy</title>
  
   <!-- Importy Jsy i Cssy -->
   <jsp:include page="../../sections/head.jsp" />
   <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js" type="text/javascript"></script>
  <script src="../../js/main.js" type="text/javascript"></script>
  <script src="../../js/tables/employee/employee.js" type="text/javascript"></script>
</head>
<body>
  <!--Menu górne i mobilne  -->
  <jsp:include page="../../sections/menuTop.jsp" />
  
  <!--kotwica-->
  <div class="findSchedule row">
    <div class="medium-6 columns">
      Wybierz Placówkę
      <select>
        <option>Lotnisko Wałęsy</option>
        <option>PGS Software</option>
      </select>
    </div>
    <div class="medium-6 columns">
      Wybierz pracownika
      <select>
        <option>Adam Nowak</option>
        <option>Jan Kowalski</option>
      </select>
    </div>
    <div class="medium-6 columns">
      Wybierz datę
      <input type="date">
    </div>
    <div class="medium-6 columns">
      <div class="buttonS text-center">Pokaż grafik</div>
    </div>
  </div>
  
  
  <div class="scheduleSection">
    <h3 style="text-align:center">21 październik 2016</h3>
    <table class="schedule">
      <tr>
        <td>12</td>
        <td>
          <div class="scheduleBreak">
            <h4>Przerwa</h4><span>12:00-13:30</span>
            <p>Przerwa</p>
          </div>
        </td>
      </tr>
      <tr>
        <td>13</td>
        <td></td>
      </tr>
      <tr>
        <td>14</td>
        <td></td>
      </tr>
      <tr>
        <td>15</td>
        <td>
          <div class="scheduleMeeting">
            <h4>Spotkanie z Tomkiem</h4><span>15:20-15:40</span>
            <p>spotkanie z okazji urodzin z Tomkiem ul.Hallera 2 jakiś długi opis długi opis</p>
          </div>
          <div class="scheduleBreak">
            <h4>Przerwa</h4><span>15:40-16:30</span>
            <p>Przerwa 1,5h na obiad.</p>
          </div>
        </td>
      </tr>
      <tr>
        <td>16</td>
        <td></td>
      </tr>
      <tr>
        <td>17</td>
        <td></td>
      </tr>
    </table>
    <div class="buttonS">Dodaj wizyte do grafiku</div>
  </div>
  
  <div class="addToSchedule row">
    <div class="medium-12 columns">
      Podaj nazwę
      <input type="text">
    </div>
    <div class="medium-6 columns">
      Podaj czas rozpoczęcia
      <input type="time">
    </div>
    <div class="medium-6 columns">
      Podaj czas zakończenia
      <input type="time">
    </div>
    <div class="medium-6 columns">
      Opis
      <textarea></textarea>
    </div>
    <div class="medium-6 columns">
      <div class="buttonS text-center">Dodaj</div>
    </div>
  </div>
  
      <!--stopka  -->
  <jsp:include page="../../sections/footer.jsp" />
</body>
</html>