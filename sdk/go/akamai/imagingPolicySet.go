// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-akamai/sdk/v6/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ImagingPolicySet struct {
	pulumi.CustomResourceState

	// The unique identifier for the Akamai Contract containing the Policy Set(s)
	ContractId pulumi.StringOutput `pulumi:"contractId"`
	// A friendly name for the Policy Set
	Name pulumi.StringOutput `pulumi:"name"`
	// The geographic region which media using this Policy Set is optimized for
	Region pulumi.StringOutput `pulumi:"region"`
	// The type of media this Policy Set manages
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewImagingPolicySet registers a new resource with the given unique name, arguments, and options.
func NewImagingPolicySet(ctx *pulumi.Context,
	name string, args *ImagingPolicySetArgs, opts ...pulumi.ResourceOption) (*ImagingPolicySet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContractId == nil {
		return nil, errors.New("invalid value for required argument 'ContractId'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ImagingPolicySet
	err := ctx.RegisterResource("akamai:index/imagingPolicySet:ImagingPolicySet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImagingPolicySet gets an existing ImagingPolicySet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImagingPolicySet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImagingPolicySetState, opts ...pulumi.ResourceOption) (*ImagingPolicySet, error) {
	var resource ImagingPolicySet
	err := ctx.ReadResource("akamai:index/imagingPolicySet:ImagingPolicySet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ImagingPolicySet resources.
type imagingPolicySetState struct {
	// The unique identifier for the Akamai Contract containing the Policy Set(s)
	ContractId *string `pulumi:"contractId"`
	// A friendly name for the Policy Set
	Name *string `pulumi:"name"`
	// The geographic region which media using this Policy Set is optimized for
	Region *string `pulumi:"region"`
	// The type of media this Policy Set manages
	Type *string `pulumi:"type"`
}

type ImagingPolicySetState struct {
	// The unique identifier for the Akamai Contract containing the Policy Set(s)
	ContractId pulumi.StringPtrInput
	// A friendly name for the Policy Set
	Name pulumi.StringPtrInput
	// The geographic region which media using this Policy Set is optimized for
	Region pulumi.StringPtrInput
	// The type of media this Policy Set manages
	Type pulumi.StringPtrInput
}

func (ImagingPolicySetState) ElementType() reflect.Type {
	return reflect.TypeOf((*imagingPolicySetState)(nil)).Elem()
}

type imagingPolicySetArgs struct {
	// The unique identifier for the Akamai Contract containing the Policy Set(s)
	ContractId string `pulumi:"contractId"`
	// A friendly name for the Policy Set
	Name *string `pulumi:"name"`
	// The geographic region which media using this Policy Set is optimized for
	Region string `pulumi:"region"`
	// The type of media this Policy Set manages
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a ImagingPolicySet resource.
type ImagingPolicySetArgs struct {
	// The unique identifier for the Akamai Contract containing the Policy Set(s)
	ContractId pulumi.StringInput
	// A friendly name for the Policy Set
	Name pulumi.StringPtrInput
	// The geographic region which media using this Policy Set is optimized for
	Region pulumi.StringInput
	// The type of media this Policy Set manages
	Type pulumi.StringInput
}

func (ImagingPolicySetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imagingPolicySetArgs)(nil)).Elem()
}

type ImagingPolicySetInput interface {
	pulumi.Input

	ToImagingPolicySetOutput() ImagingPolicySetOutput
	ToImagingPolicySetOutputWithContext(ctx context.Context) ImagingPolicySetOutput
}

func (*ImagingPolicySet) ElementType() reflect.Type {
	return reflect.TypeOf((**ImagingPolicySet)(nil)).Elem()
}

func (i *ImagingPolicySet) ToImagingPolicySetOutput() ImagingPolicySetOutput {
	return i.ToImagingPolicySetOutputWithContext(context.Background())
}

func (i *ImagingPolicySet) ToImagingPolicySetOutputWithContext(ctx context.Context) ImagingPolicySetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImagingPolicySetOutput)
}

// ImagingPolicySetArrayInput is an input type that accepts ImagingPolicySetArray and ImagingPolicySetArrayOutput values.
// You can construct a concrete instance of `ImagingPolicySetArrayInput` via:
//
//	ImagingPolicySetArray{ ImagingPolicySetArgs{...} }
type ImagingPolicySetArrayInput interface {
	pulumi.Input

	ToImagingPolicySetArrayOutput() ImagingPolicySetArrayOutput
	ToImagingPolicySetArrayOutputWithContext(context.Context) ImagingPolicySetArrayOutput
}

type ImagingPolicySetArray []ImagingPolicySetInput

func (ImagingPolicySetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImagingPolicySet)(nil)).Elem()
}

func (i ImagingPolicySetArray) ToImagingPolicySetArrayOutput() ImagingPolicySetArrayOutput {
	return i.ToImagingPolicySetArrayOutputWithContext(context.Background())
}

func (i ImagingPolicySetArray) ToImagingPolicySetArrayOutputWithContext(ctx context.Context) ImagingPolicySetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImagingPolicySetArrayOutput)
}

// ImagingPolicySetMapInput is an input type that accepts ImagingPolicySetMap and ImagingPolicySetMapOutput values.
// You can construct a concrete instance of `ImagingPolicySetMapInput` via:
//
//	ImagingPolicySetMap{ "key": ImagingPolicySetArgs{...} }
type ImagingPolicySetMapInput interface {
	pulumi.Input

	ToImagingPolicySetMapOutput() ImagingPolicySetMapOutput
	ToImagingPolicySetMapOutputWithContext(context.Context) ImagingPolicySetMapOutput
}

type ImagingPolicySetMap map[string]ImagingPolicySetInput

func (ImagingPolicySetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImagingPolicySet)(nil)).Elem()
}

func (i ImagingPolicySetMap) ToImagingPolicySetMapOutput() ImagingPolicySetMapOutput {
	return i.ToImagingPolicySetMapOutputWithContext(context.Background())
}

func (i ImagingPolicySetMap) ToImagingPolicySetMapOutputWithContext(ctx context.Context) ImagingPolicySetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImagingPolicySetMapOutput)
}

type ImagingPolicySetOutput struct{ *pulumi.OutputState }

func (ImagingPolicySetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ImagingPolicySet)(nil)).Elem()
}

func (o ImagingPolicySetOutput) ToImagingPolicySetOutput() ImagingPolicySetOutput {
	return o
}

func (o ImagingPolicySetOutput) ToImagingPolicySetOutputWithContext(ctx context.Context) ImagingPolicySetOutput {
	return o
}

// The unique identifier for the Akamai Contract containing the Policy Set(s)
func (o ImagingPolicySetOutput) ContractId() pulumi.StringOutput {
	return o.ApplyT(func(v *ImagingPolicySet) pulumi.StringOutput { return v.ContractId }).(pulumi.StringOutput)
}

// A friendly name for the Policy Set
func (o ImagingPolicySetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ImagingPolicySet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The geographic region which media using this Policy Set is optimized for
func (o ImagingPolicySetOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ImagingPolicySet) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The type of media this Policy Set manages
func (o ImagingPolicySetOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ImagingPolicySet) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ImagingPolicySetArrayOutput struct{ *pulumi.OutputState }

func (ImagingPolicySetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ImagingPolicySet)(nil)).Elem()
}

func (o ImagingPolicySetArrayOutput) ToImagingPolicySetArrayOutput() ImagingPolicySetArrayOutput {
	return o
}

func (o ImagingPolicySetArrayOutput) ToImagingPolicySetArrayOutputWithContext(ctx context.Context) ImagingPolicySetArrayOutput {
	return o
}

func (o ImagingPolicySetArrayOutput) Index(i pulumi.IntInput) ImagingPolicySetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ImagingPolicySet {
		return vs[0].([]*ImagingPolicySet)[vs[1].(int)]
	}).(ImagingPolicySetOutput)
}

type ImagingPolicySetMapOutput struct{ *pulumi.OutputState }

func (ImagingPolicySetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ImagingPolicySet)(nil)).Elem()
}

func (o ImagingPolicySetMapOutput) ToImagingPolicySetMapOutput() ImagingPolicySetMapOutput {
	return o
}

func (o ImagingPolicySetMapOutput) ToImagingPolicySetMapOutputWithContext(ctx context.Context) ImagingPolicySetMapOutput {
	return o
}

func (o ImagingPolicySetMapOutput) MapIndex(k pulumi.StringInput) ImagingPolicySetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ImagingPolicySet {
		return vs[0].(map[string]*ImagingPolicySet)[vs[1].(string)]
	}).(ImagingPolicySetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ImagingPolicySetInput)(nil)).Elem(), &ImagingPolicySet{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImagingPolicySetArrayInput)(nil)).Elem(), ImagingPolicySetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImagingPolicySetMapInput)(nil)).Elem(), ImagingPolicySetMap{})
	pulumi.RegisterOutputType(ImagingPolicySetOutput{})
	pulumi.RegisterOutputType(ImagingPolicySetArrayOutput{})
	pulumi.RegisterOutputType(ImagingPolicySetMapOutput{})
}