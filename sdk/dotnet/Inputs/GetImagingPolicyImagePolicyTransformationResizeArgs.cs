// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationResizeInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("aspect")]
        public Input<string>? Aspect { get; set; }

        [Input("aspectVar")]
        public Input<string>? AspectVar { get; set; }

        [Input("height")]
        public Input<string>? Height { get; set; }

        [Input("heightVar")]
        public Input<string>? HeightVar { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("typeVar")]
        public Input<string>? TypeVar { get; set; }

        [Input("width")]
        public Input<string>? Width { get; set; }

        [Input("widthVar")]
        public Input<string>? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationResizeInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationResizeInputArgs Empty => new GetImagingPolicyImagePolicyTransformationResizeInputArgs();
    }
}