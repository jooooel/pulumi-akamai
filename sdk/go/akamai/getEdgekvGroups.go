// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetEdgekvGroups(ctx *pulumi.Context, args *GetEdgekvGroupsArgs, opts ...pulumi.InvokeOption) (*GetEdgekvGroupsResult, error) {
	var rv GetEdgekvGroupsResult
	err := ctx.Invoke("akamai:index/getEdgekvGroups:getEdgekvGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEdgekvGroups.
type GetEdgekvGroupsArgs struct {
	NamespaceName string `pulumi:"namespaceName"`
	Network       string `pulumi:"network"`
}

// A collection of values returned by getEdgekvGroups.
type GetEdgekvGroupsResult struct {
	Groups []string `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id            string `pulumi:"id"`
	NamespaceName string `pulumi:"namespaceName"`
	Network       string `pulumi:"network"`
}

func GetEdgekvGroupsOutput(ctx *pulumi.Context, args GetEdgekvGroupsOutputArgs, opts ...pulumi.InvokeOption) GetEdgekvGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEdgekvGroupsResult, error) {
			args := v.(GetEdgekvGroupsArgs)
			r, err := GetEdgekvGroups(ctx, &args, opts...)
			var s GetEdgekvGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEdgekvGroupsResultOutput)
}

// A collection of arguments for invoking getEdgekvGroups.
type GetEdgekvGroupsOutputArgs struct {
	NamespaceName pulumi.StringInput `pulumi:"namespaceName"`
	Network       pulumi.StringInput `pulumi:"network"`
}

func (GetEdgekvGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEdgekvGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getEdgekvGroups.
type GetEdgekvGroupsResultOutput struct{ *pulumi.OutputState }

func (GetEdgekvGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEdgekvGroupsResult)(nil)).Elem()
}

func (o GetEdgekvGroupsResultOutput) ToGetEdgekvGroupsResultOutput() GetEdgekvGroupsResultOutput {
	return o
}

func (o GetEdgekvGroupsResultOutput) ToGetEdgekvGroupsResultOutputWithContext(ctx context.Context) GetEdgekvGroupsResultOutput {
	return o
}

func (o GetEdgekvGroupsResultOutput) Groups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEdgekvGroupsResult) []string { return v.Groups }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEdgekvGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEdgekvGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEdgekvGroupsResultOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v GetEdgekvGroupsResult) string { return v.NamespaceName }).(pulumi.StringOutput)
}

func (o GetEdgekvGroupsResultOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v GetEdgekvGroupsResult) string { return v.Network }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEdgekvGroupsResultOutput{})
}