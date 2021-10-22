using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace CityInfoAPI.Controllers
{
    [ApiController]
    [Route("")]
    [Route("api/cities")]
    public class CitiesController : ControllerBase
    {
       [HttpGet]
        public IActionResult GetCities()
        {

            return Ok(CitiesDataStore.Current.Cities);
        }

        [HttpGet("{id}")]
        public IActionResult GetCity(int id)
        {
            var cityToReturn = CitiesDataStore.Current.Cities
                                        .FirstOrDefault(c => c.Id == id);

            if (cityToReturn == null) {
                return NotFound();
            }

            return Ok(cityToReturn);

        }

    }
}
