exports.handler = async (event) => {
  const response = event.Records[0].cf.response;
  const headers = response.headers;

  headers['strict-transport-security'] = [{key: 'Strict-Transport-Security', value: 'max-age=31536000; includeSubdomains; preload'}];
  headers['x-content-type-options'] = [{key: 'X-Content-Type-Options', value: 'nosniff'}];
  headers['x-xss-protection'] = [{key: 'X-XSS-Protection', value: '1; mode=block'}];
  headers['x-frame-options'] = [{key: 'X-Frame-Options', value: 'DENY'}];
  headers['referrer-policy'] = [{key: 'Referrer-Policy', value: 'same-origin'}];
  headers['cache-control'] = [{key: 'Cache-Control', value: 'public, max-age=3600, s-maxage=3600'}];
  headers['x-cache'] = [{key: 'X-Cache', value: 'Hit from CloudFront'}];

  return response;
};
