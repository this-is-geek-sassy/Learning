function [J, grad] = costFunctionReg(theta, X, y, lambda)
%COSTFUNCTIONREG Compute cost and gradient for logistic regression with regularization
%   J = COSTFUNCTIONREG(theta, X, y, lambda) computes the cost of using
%   theta as the parameter for regularized logistic regression and the
%   gradient of the cost w.r.t. to the parameters. 

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

% We will compute the cost function term first.
h = X*theta;
h = sigmoid(h);

part1 = log(h);
part1 = -(y.*part1);

part2 = log(1.-h);
part2 = (1.-y).*part2;

temp = part1-part2;
temp = sum(temp);
J = temp./m;

% Let me compute the regularization term now.
temp = sum(theta(2:end).^2);
temp = (lambda/(2*m))*temp;

% We will combine both of the parts now.
J = J+temp;

% And now we shall compute the gradients:
temp2 = h-y;
temp2 = temp2.*X;
temp2 = sum(temp2);
grad = temp2./m;
% Next we will modify the 1<=j<=n terms:
clear temp2;
temp2 = theta(2:end).*(lambda/m);
% pause;
% grad = grad';
grad(2:end) = grad(2:end)+(temp2');

% =============================================================

end
