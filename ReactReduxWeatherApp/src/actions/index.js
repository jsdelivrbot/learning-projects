import axios from 'axios';

const API_KEY = '112b0f41b0ff1bf0d2e3a006c114964b';
const ROOT_URL = `http://api.openweathermap.org/data/2.5/forecast?appid=${API_KEY}`;

export const FETCH_WEATHER = 'FETCH_WEATHER';

export function fetchWeather(city) {
	const url = `${ROOT_URL}&q=${city},us`;
	const request = axios.get(url);

	return {
		type: FETCH_WEATHER,
		payload: request
	};
}

// Used Redux Promise to handle a promise received from Axios.

// Used Axios to make AJAX request.

// Middleware detected a payload, stopped the action, then waited for promise to resolve. Once promise was resolved, took data from request, assigned it back to payload property, and sent it to all reducers in application.

// Used a constant for action type, allowing us to specify action type in action and reducer. Cuts down on predisposition to make typos as opposed to pure string.

// Actions are produced by user interacting with application. When user hits submit on a form or clicks an option somewhere, action is produced and object is sent to reducers (through filter of middleware).