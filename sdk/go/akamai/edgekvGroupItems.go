// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type EdgekvGroupItems struct {
	pulumi.CustomResourceState

	// The name of the EdgeKV group.
	GroupName pulumi.StringOutput `pulumi:"groupName"`
	// A map of items within the specified group. Each item consists of an item key and a value.
	Items pulumi.StringMapOutput `pulumi:"items"`
	// The name for the EdgeKV namespace.
	NamespaceName pulumi.StringOutput `pulumi:"namespaceName"`
	// The network against which to execute the API request.
	Network pulumi.StringOutput `pulumi:"network"`
}

// NewEdgekvGroupItems registers a new resource with the given unique name, arguments, and options.
func NewEdgekvGroupItems(ctx *pulumi.Context,
	name string, args *EdgekvGroupItemsArgs, opts ...pulumi.ResourceOption) (*EdgekvGroupItems, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupName == nil {
		return nil, errors.New("invalid value for required argument 'GroupName'")
	}
	if args.Items == nil {
		return nil, errors.New("invalid value for required argument 'Items'")
	}
	if args.NamespaceName == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceName'")
	}
	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	var resource EdgekvGroupItems
	err := ctx.RegisterResource("akamai:index/edgekvGroupItems:EdgekvGroupItems", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEdgekvGroupItems gets an existing EdgekvGroupItems resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEdgekvGroupItems(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EdgekvGroupItemsState, opts ...pulumi.ResourceOption) (*EdgekvGroupItems, error) {
	var resource EdgekvGroupItems
	err := ctx.ReadResource("akamai:index/edgekvGroupItems:EdgekvGroupItems", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EdgekvGroupItems resources.
type edgekvGroupItemsState struct {
	// The name of the EdgeKV group.
	GroupName *string `pulumi:"groupName"`
	// A map of items within the specified group. Each item consists of an item key and a value.
	Items map[string]string `pulumi:"items"`
	// The name for the EdgeKV namespace.
	NamespaceName *string `pulumi:"namespaceName"`
	// The network against which to execute the API request.
	Network *string `pulumi:"network"`
}

type EdgekvGroupItemsState struct {
	// The name of the EdgeKV group.
	GroupName pulumi.StringPtrInput
	// A map of items within the specified group. Each item consists of an item key and a value.
	Items pulumi.StringMapInput
	// The name for the EdgeKV namespace.
	NamespaceName pulumi.StringPtrInput
	// The network against which to execute the API request.
	Network pulumi.StringPtrInput
}

func (EdgekvGroupItemsState) ElementType() reflect.Type {
	return reflect.TypeOf((*edgekvGroupItemsState)(nil)).Elem()
}

type edgekvGroupItemsArgs struct {
	// The name of the EdgeKV group.
	GroupName string `pulumi:"groupName"`
	// A map of items within the specified group. Each item consists of an item key and a value.
	Items map[string]string `pulumi:"items"`
	// The name for the EdgeKV namespace.
	NamespaceName string `pulumi:"namespaceName"`
	// The network against which to execute the API request.
	Network string `pulumi:"network"`
}

// The set of arguments for constructing a EdgekvGroupItems resource.
type EdgekvGroupItemsArgs struct {
	// The name of the EdgeKV group.
	GroupName pulumi.StringInput
	// A map of items within the specified group. Each item consists of an item key and a value.
	Items pulumi.StringMapInput
	// The name for the EdgeKV namespace.
	NamespaceName pulumi.StringInput
	// The network against which to execute the API request.
	Network pulumi.StringInput
}

func (EdgekvGroupItemsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*edgekvGroupItemsArgs)(nil)).Elem()
}

type EdgekvGroupItemsInput interface {
	pulumi.Input

	ToEdgekvGroupItemsOutput() EdgekvGroupItemsOutput
	ToEdgekvGroupItemsOutputWithContext(ctx context.Context) EdgekvGroupItemsOutput
}

func (*EdgekvGroupItems) ElementType() reflect.Type {
	return reflect.TypeOf((**EdgekvGroupItems)(nil)).Elem()
}

func (i *EdgekvGroupItems) ToEdgekvGroupItemsOutput() EdgekvGroupItemsOutput {
	return i.ToEdgekvGroupItemsOutputWithContext(context.Background())
}

func (i *EdgekvGroupItems) ToEdgekvGroupItemsOutputWithContext(ctx context.Context) EdgekvGroupItemsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EdgekvGroupItemsOutput)
}

// EdgekvGroupItemsArrayInput is an input type that accepts EdgekvGroupItemsArray and EdgekvGroupItemsArrayOutput values.
// You can construct a concrete instance of `EdgekvGroupItemsArrayInput` via:
//
//	EdgekvGroupItemsArray{ EdgekvGroupItemsArgs{...} }
type EdgekvGroupItemsArrayInput interface {
	pulumi.Input

	ToEdgekvGroupItemsArrayOutput() EdgekvGroupItemsArrayOutput
	ToEdgekvGroupItemsArrayOutputWithContext(context.Context) EdgekvGroupItemsArrayOutput
}

type EdgekvGroupItemsArray []EdgekvGroupItemsInput

func (EdgekvGroupItemsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EdgekvGroupItems)(nil)).Elem()
}

func (i EdgekvGroupItemsArray) ToEdgekvGroupItemsArrayOutput() EdgekvGroupItemsArrayOutput {
	return i.ToEdgekvGroupItemsArrayOutputWithContext(context.Background())
}

func (i EdgekvGroupItemsArray) ToEdgekvGroupItemsArrayOutputWithContext(ctx context.Context) EdgekvGroupItemsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EdgekvGroupItemsArrayOutput)
}

// EdgekvGroupItemsMapInput is an input type that accepts EdgekvGroupItemsMap and EdgekvGroupItemsMapOutput values.
// You can construct a concrete instance of `EdgekvGroupItemsMapInput` via:
//
//	EdgekvGroupItemsMap{ "key": EdgekvGroupItemsArgs{...} }
type EdgekvGroupItemsMapInput interface {
	pulumi.Input

	ToEdgekvGroupItemsMapOutput() EdgekvGroupItemsMapOutput
	ToEdgekvGroupItemsMapOutputWithContext(context.Context) EdgekvGroupItemsMapOutput
}

type EdgekvGroupItemsMap map[string]EdgekvGroupItemsInput

func (EdgekvGroupItemsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EdgekvGroupItems)(nil)).Elem()
}

func (i EdgekvGroupItemsMap) ToEdgekvGroupItemsMapOutput() EdgekvGroupItemsMapOutput {
	return i.ToEdgekvGroupItemsMapOutputWithContext(context.Background())
}

func (i EdgekvGroupItemsMap) ToEdgekvGroupItemsMapOutputWithContext(ctx context.Context) EdgekvGroupItemsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EdgekvGroupItemsMapOutput)
}

type EdgekvGroupItemsOutput struct{ *pulumi.OutputState }

func (EdgekvGroupItemsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EdgekvGroupItems)(nil)).Elem()
}

func (o EdgekvGroupItemsOutput) ToEdgekvGroupItemsOutput() EdgekvGroupItemsOutput {
	return o
}

func (o EdgekvGroupItemsOutput) ToEdgekvGroupItemsOutputWithContext(ctx context.Context) EdgekvGroupItemsOutput {
	return o
}

// The name of the EdgeKV group.
func (o EdgekvGroupItemsOutput) GroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *EdgekvGroupItems) pulumi.StringOutput { return v.GroupName }).(pulumi.StringOutput)
}

// A map of items within the specified group. Each item consists of an item key and a value.
func (o EdgekvGroupItemsOutput) Items() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EdgekvGroupItems) pulumi.StringMapOutput { return v.Items }).(pulumi.StringMapOutput)
}

// The name for the EdgeKV namespace.
func (o EdgekvGroupItemsOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *EdgekvGroupItems) pulumi.StringOutput { return v.NamespaceName }).(pulumi.StringOutput)
}

// The network against which to execute the API request.
func (o EdgekvGroupItemsOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v *EdgekvGroupItems) pulumi.StringOutput { return v.Network }).(pulumi.StringOutput)
}

type EdgekvGroupItemsArrayOutput struct{ *pulumi.OutputState }

func (EdgekvGroupItemsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EdgekvGroupItems)(nil)).Elem()
}

func (o EdgekvGroupItemsArrayOutput) ToEdgekvGroupItemsArrayOutput() EdgekvGroupItemsArrayOutput {
	return o
}

func (o EdgekvGroupItemsArrayOutput) ToEdgekvGroupItemsArrayOutputWithContext(ctx context.Context) EdgekvGroupItemsArrayOutput {
	return o
}

func (o EdgekvGroupItemsArrayOutput) Index(i pulumi.IntInput) EdgekvGroupItemsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EdgekvGroupItems {
		return vs[0].([]*EdgekvGroupItems)[vs[1].(int)]
	}).(EdgekvGroupItemsOutput)
}

type EdgekvGroupItemsMapOutput struct{ *pulumi.OutputState }

func (EdgekvGroupItemsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EdgekvGroupItems)(nil)).Elem()
}

func (o EdgekvGroupItemsMapOutput) ToEdgekvGroupItemsMapOutput() EdgekvGroupItemsMapOutput {
	return o
}

func (o EdgekvGroupItemsMapOutput) ToEdgekvGroupItemsMapOutputWithContext(ctx context.Context) EdgekvGroupItemsMapOutput {
	return o
}

func (o EdgekvGroupItemsMapOutput) MapIndex(k pulumi.StringInput) EdgekvGroupItemsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EdgekvGroupItems {
		return vs[0].(map[string]*EdgekvGroupItems)[vs[1].(string)]
	}).(EdgekvGroupItemsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EdgekvGroupItemsInput)(nil)).Elem(), &EdgekvGroupItems{})
	pulumi.RegisterInputType(reflect.TypeOf((*EdgekvGroupItemsArrayInput)(nil)).Elem(), EdgekvGroupItemsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EdgekvGroupItemsMapInput)(nil)).Elem(), EdgekvGroupItemsMap{})
	pulumi.RegisterOutputType(EdgekvGroupItemsOutput{})
	pulumi.RegisterOutputType(EdgekvGroupItemsArrayOutput{})
	pulumi.RegisterOutputType(EdgekvGroupItemsMapOutput{})
}