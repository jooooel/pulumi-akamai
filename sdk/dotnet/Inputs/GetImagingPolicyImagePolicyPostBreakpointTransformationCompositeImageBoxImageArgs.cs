// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("color")]
        public Input<string>? Color { get; set; }

        [Input("colorVar")]
        public Input<string>? ColorVar { get; set; }

        [Input("height")]
        public Input<string>? Height { get; set; }

        [Input("heightVar")]
        public Input<string>? HeightVar { get; set; }

        [Input("transformation")]
        public Input<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationInputArgs>? Transformation { get; set; }

        [Input("width")]
        public Input<string>? Width { get; set; }

        [Input("widthVar")]
        public Input<string>? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageInputArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageInputArgs();
    }
}
