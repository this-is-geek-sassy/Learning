function [J, grad] = costFunction(theta, X, y)
%COSTFUNCTION Compute cost and gradient for logistic regression
%   J = COSTFUNCTION(theta, X, y) computes the cost of using theta as the
%   parameter for logistic regression and the gradient of the cost
%   w.r.t. to the parameters.

% Initialize some useful values
m = length(y); % number of training examples

% You need to return the following variables correctly 
J = 0;
grad = zeros(size(theta));

% ====================== YOUR CODE HERE ======================
% Instructions: Compute the cost of a particular choice of theta.
%               You should set J to the cost.
%               Compute the partial derivatives and set grad to the partial
%               derivatives of the cost w.r.t. each parameter in theta
%
% Note: grad should have the same dimensions as theta
%

h = X*theta;
h = sigmoid(h);

part1 = log(h);
part1 = -(y.*part1);

part2 = log(1.-h);
part2 = (1.-y).*part2;

temp = part1-part2;
temp = sum(temp);
J = temp./m;

temp2 = h-y;
temp2 = temp2.*X;
temp2 = sum(temp2);
grad = temp2./m;



% =============================================================

end
