/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        "dark-purple": "#081A51",
        "light-purple": "rgba(255,255,255,0.17)",
        "primary": "rgba(2, 117, 216)"
      },
    },
  },
  plugins: [],
}
