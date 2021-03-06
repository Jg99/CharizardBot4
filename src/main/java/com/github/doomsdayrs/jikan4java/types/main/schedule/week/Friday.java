package com.github.doomsdayrs.jikan4java.types.main.schedule.week;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.doomsdayrs.jikan4java.types.main.schedule.Day;
import com.github.doomsdayrs.jikan4java.types.main.schedule.SubAnime;

import java.util.ArrayList;

/*
 * This file is part of Jikan4java.
 *
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Jikan4java is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * ====================================================================*//**
 * Jikan4java
 * 01 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
public class Friday extends Day {
    public Friday(@JsonProperty("request_hash") String request_hash, @JsonProperty("request_cached") boolean request_cached, @JsonProperty("request_cache_expiry") int request_cache_expiry,
                  @JsonProperty("friday") ArrayList<SubAnime> subAnimes) {
        super(request_hash, request_cached, request_cache_expiry, subAnimes);
    }
}
