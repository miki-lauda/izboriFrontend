using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication4.Models
{
    public class Glasac
    {
        public long Id { get; set; }
        public string Ime { get; set; }
        public string Prezime { get; set; }
        public string ImeOca { get; set; }
        public string DatumRodjenja { get; set; }
        public int IznosPlacanja { get; set; }
        public string IzbornaJedinica { get; set; }
        public string GlasDobavio { get; set; }
    }
}