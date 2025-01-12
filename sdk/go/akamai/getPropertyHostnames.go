// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v6/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func GetPropertyHostnames(ctx *pulumi.Context, args *GetPropertyHostnamesArgs, opts ...pulumi.InvokeOption) (*GetPropertyHostnamesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPropertyHostnamesResult
	err := ctx.Invoke("akamai:index/getPropertyHostnames:getPropertyHostnames", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPropertyHostnames.
type GetPropertyHostnamesArgs struct {
	ContractId string `pulumi:"contractId"`
	GroupId    string `pulumi:"groupId"`
	PropertyId string `pulumi:"propertyId"`
}

// A collection of values returned by getPropertyHostnames.
type GetPropertyHostnamesResult struct {
	ContractId string                         `pulumi:"contractId"`
	GroupId    string                         `pulumi:"groupId"`
	Hostnames  []GetPropertyHostnamesHostname `pulumi:"hostnames"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	PropertyId string `pulumi:"propertyId"`
	Version    int    `pulumi:"version"`
}

func GetPropertyHostnamesOutput(ctx *pulumi.Context, args GetPropertyHostnamesOutputArgs, opts ...pulumi.InvokeOption) GetPropertyHostnamesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPropertyHostnamesResult, error) {
			args := v.(GetPropertyHostnamesArgs)
			r, err := GetPropertyHostnames(ctx, &args, opts...)
			var s GetPropertyHostnamesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPropertyHostnamesResultOutput)
}

// A collection of arguments for invoking getPropertyHostnames.
type GetPropertyHostnamesOutputArgs struct {
	ContractId pulumi.StringInput `pulumi:"contractId"`
	GroupId    pulumi.StringInput `pulumi:"groupId"`
	PropertyId pulumi.StringInput `pulumi:"propertyId"`
}

func (GetPropertyHostnamesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPropertyHostnamesArgs)(nil)).Elem()
}

// A collection of values returned by getPropertyHostnames.
type GetPropertyHostnamesResultOutput struct{ *pulumi.OutputState }

func (GetPropertyHostnamesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPropertyHostnamesResult)(nil)).Elem()
}

func (o GetPropertyHostnamesResultOutput) ToGetPropertyHostnamesResultOutput() GetPropertyHostnamesResultOutput {
	return o
}

func (o GetPropertyHostnamesResultOutput) ToGetPropertyHostnamesResultOutputWithContext(ctx context.Context) GetPropertyHostnamesResultOutput {
	return o
}

func (o GetPropertyHostnamesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetPropertyHostnamesResult] {
	return pulumix.Output[GetPropertyHostnamesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetPropertyHostnamesResultOutput) ContractId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPropertyHostnamesResult) string { return v.ContractId }).(pulumi.StringOutput)
}

func (o GetPropertyHostnamesResultOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPropertyHostnamesResult) string { return v.GroupId }).(pulumi.StringOutput)
}

func (o GetPropertyHostnamesResultOutput) Hostnames() GetPropertyHostnamesHostnameArrayOutput {
	return o.ApplyT(func(v GetPropertyHostnamesResult) []GetPropertyHostnamesHostname { return v.Hostnames }).(GetPropertyHostnamesHostnameArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPropertyHostnamesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPropertyHostnamesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPropertyHostnamesResultOutput) PropertyId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPropertyHostnamesResult) string { return v.PropertyId }).(pulumi.StringOutput)
}

func (o GetPropertyHostnamesResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v GetPropertyHostnamesResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPropertyHostnamesResultOutput{})
}
