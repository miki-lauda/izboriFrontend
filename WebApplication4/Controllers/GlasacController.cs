using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using WebApplication4.Models;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using Newtonsoft.Json;

namespace WebApplication4.Controllers
{
    public class GlasacController : ApiController
    {

        public HttpResponseMessage Get()
        {
            DataTable tabela = new DataTable(tableName:"TabelaGlasaci");

            string query = "select * from dbo.Glasac";
            using (var connection = new SqlConnection(ConfigurationManager.ConnectionStrings["GlasaciDB"].ConnectionString)) 
            using (var cmd = new SqlCommand(query, connection))
                using(var da=new SqlDataAdapter(cmd))
            {
                cmd.CommandType = CommandType.Text;
                da.Fill(tabela);
                string JSONresult;
                JSONresult = JsonConvert.SerializeObject(tabela);
                return Request.CreateResponse(HttpStatusCode.OK, JSONresult);
            }
           
        }

        public Boolean Post(Glasac glasac)
        {
            try
            {
                DataTable tabela = new DataTable();

                string query = "insert into dbo.Glasac(ime,prezime,imeOca,izbornaJedinica,iznosPlacanja,glasDobavio,datumRodjenja) values('"+glasac.Ime+"','"+glasac.Prezime+ "','" + glasac.ImeOca + "','" + glasac.IzbornaJedinica + "'," + glasac.IznosPlacanja + ",'" + glasac.GlasDobavio + "','" + glasac.DatumRodjenja + "')";
                using (var connection = new SqlConnection(ConfigurationManager.ConnectionStrings["GlasaciDB"].ConnectionString))
                using (var cmd = new SqlCommand(query, connection))
                using (var da = new SqlDataAdapter(cmd))
                {
                    cmd.CommandType = CommandType.Text;
                    da.Fill(tabela);
                }
                return true;
            }
            catch(Exception)
            {
                return false;
            }
        }
    }
}
