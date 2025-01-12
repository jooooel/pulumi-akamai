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

func GetAppSecHostnameCoverage(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAppSecHostnameCoverageResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAppSecHostnameCoverageResult
	err := ctx.Invoke("akamai:index/getAppSecHostnameCoverage:getAppSecHostnameCoverage", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAppSecHostnameCoverage.
type GetAppSecHostnameCoverageResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	Json       string `pulumi:"json"`
	OutputText string `pulumi:"outputText"`
}

func GetAppSecHostnameCoverageOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetAppSecHostnameCoverageResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetAppSecHostnameCoverageResult, error) {
		r, err := GetAppSecHostnameCoverage(ctx, opts...)
		var s GetAppSecHostnameCoverageResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetAppSecHostnameCoverageResultOutput)
}

// A collection of values returned by getAppSecHostnameCoverage.
type GetAppSecHostnameCoverageResultOutput struct{ *pulumi.OutputState }

func (GetAppSecHostnameCoverageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAppSecHostnameCoverageResult)(nil)).Elem()
}

func (o GetAppSecHostnameCoverageResultOutput) ToGetAppSecHostnameCoverageResultOutput() GetAppSecHostnameCoverageResultOutput {
	return o
}

func (o GetAppSecHostnameCoverageResultOutput) ToGetAppSecHostnameCoverageResultOutputWithContext(ctx context.Context) GetAppSecHostnameCoverageResultOutput {
	return o
}

func (o GetAppSecHostnameCoverageResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAppSecHostnameCoverageResult] {
	return pulumix.Output[GetAppSecHostnameCoverageResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetAppSecHostnameCoverageResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecHostnameCoverageResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAppSecHostnameCoverageResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecHostnameCoverageResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetAppSecHostnameCoverageResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v GetAppSecHostnameCoverageResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAppSecHostnameCoverageResultOutput{})
}
